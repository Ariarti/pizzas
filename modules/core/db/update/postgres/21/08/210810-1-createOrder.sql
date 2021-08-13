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
);