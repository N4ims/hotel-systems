package com.n4ims.hotelsystem.entities;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "room_types", schema = "hotel_system")
public class RoomTypeEntity {
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
    @Column(name = "bed_type")
    private String bedType;
    @Basic
    @Column(name = "number_of_beds")
    private Integer numberOfBeds;
    @Basic
    @Column(name = "max_persons")
    private Integer maxPersons;
    @Basic
    @Column(name = "base_price")
    private Integer basePrice;
    @Basic
    @Column(name = "size")
    private Integer size;
    @ManyToMany
    @JoinTable(
            name = "room_type_amenities",
            joinColumns = {@JoinColumn(name = "room_type_id")},
            inverseJoinColumns = {@JoinColumn(name = "amenity_id")}
    )
    private Set<AmenityEntity> amenities;

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

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Integer getMaxPersons() {
        return maxPersons;
    }

    public void setMaxPersons(Integer maxPersons) {
        this.maxPersons = maxPersons;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Set<AmenityEntity> getAmenities() {
        return amenities;
    }

    public void setAmenities(Set<AmenityEntity> amenities) {
        this.amenities = amenities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomTypeEntity that = (RoomTypeEntity) o;
        return id == that.id && Objects.equals(type, that.type) && Objects.equals(description, that.description) && Objects.equals(bedType, that.bedType) && Objects.equals(numberOfBeds, that.numberOfBeds) && Objects.equals(maxPersons, that.maxPersons) && Objects.equals(basePrice, that.basePrice) && Objects.equals(size, that.size) && Objects.equals(amenities, that.amenities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, description, bedType, numberOfBeds, maxPersons, basePrice, size, amenities);
    }
}