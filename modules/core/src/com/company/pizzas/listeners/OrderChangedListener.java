package com.company.pizzas.listeners;

import com.company.pizzas.entity.Order;
import com.company.pizzas.entity.Payment;
import com.company.pizzas.entity.Status;
import com.haulmont.cuba.core.app.events.AttributeChanges;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import com.haulmont.cuba.core.entity.contracts.Id;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.View;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.UUID;

@Component("pizzas_OrderChangedListener")
public class OrderChangedListener {

    @Inject
    private DataManager dataManager;

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void afterCommit(EntityChangedEvent<Order, UUID> event) {
        AttributeChanges changes = event.getChanges();
        if (!changes.isChanged("status")) {
            return;
        }

        Order order = dataManager.load(event.getEntityId())
                .view(View.LOCAL)
                .one();

        Payment payment = dataManager.create(Payment.class);
        if (order.getStatus() == Status.PAID) {
            payment.setOrder(order);
            payment.setAmount(order.getTotalAmount());
            dataManager.commit(payment);
        } else if (order.getStatus() == Status.CANCELED) {
            Status prevStatus = Status.fromId(event.getChanges().getOldValue("status"));
            if (prevStatus == Status.COOKING
                    || prevStatus == Status.PAID) {
                payment.setOrder(order);
                payment.setAmount(order.getTotalAmount());
                payment.setRefund(true);
                dataManager.commit(payment);
            }
        }
    }
}
