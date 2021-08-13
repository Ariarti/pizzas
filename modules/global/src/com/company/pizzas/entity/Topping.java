package com.company.pizzas.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PIZZAS_TOPPING")
@Entity(name = "pizzas_Topping")
@NamePattern("%s|name")
public class Topping extends StandardEntity {
    private static final long serialVersionUID = 8392981158142724952L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "SPICY")
    private Boolean spicy;

    public Boolean getSpicy() {
        return spicy;
    }

    public void setSpicy(Boolean spicy) {
        this.spicy = spicy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}