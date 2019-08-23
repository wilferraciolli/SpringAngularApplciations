/*
 * (c) Midland Software Limited 2019
 * Name     : KeyEntity.java
 * Author   : ferraciolliw
 * Date     : 23 Aug 2019
 */
package com.wiltech.admin.dashboard.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class KeyEntity {

    @Id
    @Column(name = "PK", unique = true)
    private String pk;
}
