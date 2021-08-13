package com.company.pizzas.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "PIZZAS_INGREDIENT")
@Entity(name = "pizzas_Ingredient")
@NamePattern("%s %s|topping,amount")
public class Ingredient extends StandardEntity {
    private static final long serialVersionUID = 1585390891160642560L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PIZZA_ID")
    private Pizza pizza;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TOPPING_ID")
    @NotNull
    private Topping topping;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    private Integer amount;

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }
}