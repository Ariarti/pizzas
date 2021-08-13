package com.company.pizzas.web.screens.payment;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Payment;

@UiController("pizzas_Payment.edit")
@UiDescriptor("payment-edit.xml")
@EditedEntityContainer("paymentDc")
@LoadDataBeforeShow
public class PaymentEdit extends StandardEditor<Payment> {
}