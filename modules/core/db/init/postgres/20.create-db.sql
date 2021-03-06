-- begin PIZZAS_DELIVERY
alter table PIZZAS_DELIVERY add constraint FK_PIZZAS_DELIVERY_ON_CLIENT foreign key (CLIENT_ID) references PIZZAS_CLIENT(ID)^
alter table PIZZAS_DELIVERY add constraint FK_PIZZAS_DELIVERY_ON_COURIER foreign key (COURIER_ID) references SEC_USER(ID)^
create index IDX_PIZZAS_DELIVERY_ON_CLIENT on PIZZAS_DELIVERY (CLIENT_ID)^
create index IDX_PIZZAS_DELIVERY_ON_COURIER on PIZZAS_DELIVERY (COURIER_ID)^
-- end PIZZAS_DELIVERY
-- begin PIZZAS_PAYMENT
alter table PIZZAS_PAYMENT add constraint FK_PIZZAS_PAYMENT_ON_ORDER foreign key (ORDER_ID) references PIZZAS_ORDER(ID)^
create index IDX_PIZZAS_PAYMENT_ON_ORDER on PIZZAS_PAYMENT (ORDER_ID)^
-- end PIZZAS_PAYMENT
-- begin PIZZAS_INGREDIENT
alter table PIZZAS_INGREDIENT add constraint FK_PIZZAS_INGREDIENT_ON_PIZZA foreign key (PIZZA_ID) references PIZZAS_PIZZA(ID)^
alter table PIZZAS_INGREDIENT add constraint FK_PIZZAS_INGREDIENT_ON_TOPPING foreign key (TOPPING_ID) references PIZZAS_TOPPING(ID)^
create index IDX_PIZZAS_INGREDIENT_ON_PIZZA on PIZZAS_INGREDIENT (PIZZA_ID)^
create index IDX_PIZZAS_INGREDIENT_ON_TOPPING on PIZZAS_INGREDIENT (TOPPING_ID)^
-- end PIZZAS_INGREDIENT
-- begin PIZZAS_ORDER_ITEM
alter table PIZZAS_ORDER_ITEM add constraint FK_PIZZAS_ORDER_ITEM_ON_ORDER foreign key (ORDER_ID) references PIZZAS_ORDER(ID)^
alter table PIZZAS_ORDER_ITEM add constraint FK_PIZZAS_ORDER_ITEM_ON_PIZZA foreign key (PIZZA_ID) references PIZZAS_PIZZA(ID)^
create index IDX_PIZZAS_ORDER_ITEM_ON_ORDER on PIZZAS_ORDER_ITEM (ORDER_ID)^
create index IDX_PIZZAS_ORDER_ITEM_ON_PIZZA on PIZZAS_ORDER_ITEM (PIZZA_ID)^
-- end PIZZAS_ORDER_ITEM
-- begin PIZZAS_ORDER
alter table PIZZAS_ORDER add constraint FK_PIZZAS_ORDER_ON_DELIVERY foreign key (DELIVERY_ID) references PIZZAS_DELIVERY(ID)^
create index IDX_PIZZAS_ORDER_ON_DELIVERY on PIZZAS_ORDER (DELIVERY_ID)^
-- end PIZZAS_ORDER
-- begin PIZZAS_PIZZA
alter table PIZZAS_PIZZA add constraint FK_PIZZAS_PIZZA_ON_IMAGE foreign key (IMAGE_ID) references SYS_FILE(ID)^
create index IDX_PIZZAS_PIZZA_ON_IMAGE on PIZZAS_PIZZA (IMAGE_ID)^
-- end PIZZAS_PIZZA
-- begin PIZZAS_CLIENT
create unique index IDX_PIZZAS_CLIENT_UK_EMAIL on PIZZAS_CLIENT (EMAIL) where DELETE_TS is null ^
create unique index IDX_PIZZAS_CLIENT_UK_PHONE on PIZZAS_CLIENT (PHONE) where DELETE_TS is null ^
-- end PIZZAS_CLIENT
