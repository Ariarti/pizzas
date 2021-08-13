package com.company.pizzas.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "PIZZAS_PIZZA")
@Entity(name = "pizzas_Pizza")
@NamePattern("%s|name")
public class Pizza extends StandardEntity {
    private static final long serialVersionUID = -2352185229284418648L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "SIZE_", nullable = false)
    private Integer size;

    @NotNull
    @Column(name = "CALORIES", nullable = false)
    private Integer calories;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @JoinColumn(name = "IMAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private FileDescriptor image;

    @OneToMany(mappedBy = "pizza")
    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setImage(FileDescriptor image) {
        this.image = image;
    }

    public FileDescriptor getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}