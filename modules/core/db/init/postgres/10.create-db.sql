-- begin PIZZAS_DELIVERY
create table PIZZAS_DELIVERY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLIENT_ID uuid not null,
    COURIER_ID uuid not null,
    COMMENT_ text,
    --
    primary key (ID)
)^
-- end PIZZAS_DELIVERY
-- begin PIZZAS_PAYMENT
create table PIZZAS_PAYMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID uuid,
    AMOUNT decimal(19, 2) not null,
    REFUND boolean,
    --
    primary key (ID)
)^
-- end PIZZAS_PAYMENT
-- begin PIZZAS_TOPPING
create table PIZZAS_TOPPING (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SPICY boolean,
    --
    primary key (ID)
)^
-- end PIZZAS_TOPPING
-- begin PIZZAS_INGREDIENT
create table PIZZAS_INGREDIENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PIZZA_ID uuid,
    TOPPING_ID uuid not null,
    AMOUNT integer not null,
    --
    primary key (ID)
)^
-- end PIZZAS_INGREDIENT
-- begin PIZZAS_ORDER_ITEM
create table PIZZAS_ORDER_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID uuid,
    PIZZA_ID uuid,
    QUANTITY integer not null,
    --
    primary key (ID)
)^
-- end PIZZAS_ORDER_ITEM
-- begin PIZZAS_ORDER
create table PIZZAS_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(255),
    CREATE_DATE timestamp,
    STATUS integer,
    TOTAL_AMOUNT decimal(19, 2) not null,
    DELIVERY_ID uuid,
    --
    primary key (ID)
)^
-- end PIZZAS_ORDER
-- begin PIZZAS_PIZZA
create table PIZZAS_PIZZA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SIZE_ integer not null,
    CALORIES integer not null,
    PRICE decimal(19, 2) not null,
    DESCRIPTION text,
    IMAGE_ID uuid,
    --
    primary key (ID)
)^
-- end PIZZAS_PIZZA
-- begin PIZZAS_CLIENT
create table PIZZAS_CLIENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    ADDRESS varchar(255) not null,
    PHONE varchar(15) not null,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end PIZZAS_CLIENT
