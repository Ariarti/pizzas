package com.company.pizzas.web.screens.payment;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Payment;

@UiController("pizzas_Payment.browse")
@UiDescriptor("payment-browse.xml")
@LookupComponent("paymentsTable")
@LoadDataBeforeShow
public class PaymentBrowse extends StandardLookup<Payment> {
}