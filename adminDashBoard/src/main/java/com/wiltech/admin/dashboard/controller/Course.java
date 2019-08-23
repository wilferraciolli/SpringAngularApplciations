/*
 * (c) Midland Software Limited 2019
 * Name     : Course.java
 * Author   : ferraciolliw
 * Date     : 23 Aug 2019
 */
package com.wiltech.admin.dashboard.controller;

import lombok.Data;

/**
 *
 */
@Data
public class Course {

    String name;
    Integer chapterCount;

    public Course(String name, Integer chapterCount) {
        this.name = name;
        this.chapterCount = chapterCount;
    }
}
