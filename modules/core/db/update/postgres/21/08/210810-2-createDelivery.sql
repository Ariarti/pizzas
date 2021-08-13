alter table PIZZAS_DELIVERY add constraint FK_PIZZAS_DELIVERY_ON_CLIENT foreign key (CLIENT_ID) references PIZZAS_CLIENT(ID);
alter table PIZZAS_DELIVERY add constraint FK_PIZZAS_DELIVERY_ON_COURIER foreign key (COURIER_ID) references SEC_USER(ID);
create index IDX_PIZZAS_DELIVERY_ON_CLIENT on PIZZAS_DELIVERY (CLIENT_ID);
create index IDX_PIZZAS_DELIVERY_ON_COURIER on PIZZAS_DELIVERY (COURIER_ID);
