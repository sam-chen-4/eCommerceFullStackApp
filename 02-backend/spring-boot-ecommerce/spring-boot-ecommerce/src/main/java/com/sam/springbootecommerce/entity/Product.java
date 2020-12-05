package com.sam.springbootecommerce.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data //lombok provides getters/setters behind the scenes
public class Product {

    private Long id;

    private String sku;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private String imageUrl;

    private boolean active;

    private int unitsInStock;

    private Date dateCreated;

    private Date lastUpdated;
}
