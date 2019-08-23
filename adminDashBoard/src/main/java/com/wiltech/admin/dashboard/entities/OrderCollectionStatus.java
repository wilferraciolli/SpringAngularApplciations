/*
 * (c) Midland Software Limited 2019
 * Name     : OrderCollectionStatus.java
 * Author   : ferraciolliw
 * Date     : 23 Aug 2019
 */
package com.wiltech.admin.dashboard.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "OrderCollectionStatus", schema = "adminDashApp")
public class OrderCollectionStatus extends KeyEntity {
    private int newOrders;
    private double revenue;
    private int shipped;
    private int returned;

}
