create unique index IDX_PIZZAS_CLIENT_UK_EMAIL on PIZZAS_CLIENT (EMAIL) where DELETE_TS is null ;
create unique index IDX_PIZZAS_CLIENT_UK_PHONE on PIZZAS_CLIENT (PHONE) where DELETE_TS is null ;
