/*
 * (c) Midland Software Limited 2019
 * Name     : EmployeeInformation.java
 * Author   : ferraciolliw
 * Date     : 23 Aug 2019
 */
package com.wiltech.admin.dashboard.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EmployeeInformation")
public class EmployeeInformation extends KeyEntity {

    private String _name;
    private String position;
    private String officeLocation;
    private int age;
    private Date startDate;
    private double salary;
}
