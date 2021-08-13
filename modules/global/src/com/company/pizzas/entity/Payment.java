package com.company.pizzas.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "PIZZAS_PAYMENT")
@Entity(name = "pizzas_Payment")
@NamePattern("%s %s|amount,order")
public class Payment extends StandardEntity {
    private static final long serialVersionUID = 7012524134213735225L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    @Column(name = "REFUND")
    private Boolean refund;

    public Boolean getRefund() {
        return refund;
    }

    public void setRefund(Boolean refund) {
        this.refund = refund;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}