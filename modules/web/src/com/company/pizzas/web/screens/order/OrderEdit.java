package com.company.pizzas.web.screens.order;

import com.company.pizzas.entity.OrderItem;
import com.company.pizzas.service.OrderService;
import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Order;

import javax.inject.Inject;

@UiController("pizzas_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {

    @Inject
    private OrderService orderService;

    private void refreshAmount() {
        Order order = getEditedEntity();
        order.setTotalAmount(orderService.calculateOrder(order));
    }

    @Subscribe(id = "itemsDc", target = Target.DATA_CONTAINER)
    public void onItemsDcCollectionChange(CollectionContainer.CollectionChangeEvent<OrderItem> event) {
        if (event.getChangeType() != CollectionChangeType.REFRESH) {
            refreshAmount();
        }
    }
    
    

}