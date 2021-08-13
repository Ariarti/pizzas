package com.company.pizzas.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Client;

@UiController("pizzas_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}