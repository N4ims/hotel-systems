package com.n4ims.hotelsystem.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "package_types", schema = "hotel_system")
public class PackageTypesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "price")
    private Integer price;
    @Basic
    @Column(name = "amount")
    private Integer amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageTypesEntity that = (PackageTypesEntity) o;
        return id == that.id && Objects.equals(type, that.type) && Objects.equals(description, that.description) && Objects.equals(price, that.price) && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, description, price, amount);
    }
}
