/*
 * (c) Midland Software Limited 2019
 * Name     : CompanyRevenue.java
 * Author   : ferraciolliw
 * Date     : 23 Aug 2019
 */
package com.wiltech.admin.dashboard.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Company_Revenue", schema = "adminDashApp")
public class CompanyRevenue extends KeyEntity {

    @Column(name = "Revenue_Month", nullable = false)
    private String _month;

    @Column(name = "revenue", nullable = false)
    private double revenue;

    @Column(name = "expense")
    private double expense;

    @Column(name = "margins")
    private double margins;
}
