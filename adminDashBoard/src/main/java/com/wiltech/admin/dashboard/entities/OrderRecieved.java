/*
 * (c) Midland Software Limited 2019
 * Name     : OrderRecieved.java
 * Author   : ferraciolliw
 * Date     : 23 Aug 2019
 */
package com.wiltech.admin.dashboard.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "OrderRecieved", schema = "ecomDashApp")
public class OrderRecieved extends KeyEntity {

    private int orderReceived;
    private String dateReceived;
}
