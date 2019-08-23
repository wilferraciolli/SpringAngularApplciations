/*
 * (c) Midland Software Limited 2019
 * Name     : ProductCategory.java
 * Author   : ferraciolliw
 * Date     : 23 Aug 2019
 */
package com.wiltech.admin.dashboard.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ProductCategory")
public class ProductCategory extends KeyEntity {

    private String categoryName;
    private int percentage;
    private boolean bestCategory;
}
