package com.company.pizzas.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Client;

@UiController("pizzas_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}