alter table PIZZAS_PIZZA add constraint FK_PIZZAS_PIZZA_ON_IMAGE foreign key (IMAGE_ID) references SYS_FILE(ID);
create index IDX_PIZZAS_PIZZA_ON_IMAGE on PIZZAS_PIZZA (IMAGE_ID);
