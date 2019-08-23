/*
 * (c) Midland Software Limited 2019
 * Name     : RestController.java
 * Author   : ferraciolliw
 * Date     : 23 Aug 2019
 */
package com.wiltech.admin.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoint {

    @Autowired
    private RegionInfoConfiguration regionInfoConfiguration;

    @RequestMapping("/regioninfo")
    public String getRegionInfo() {

        return regionInfoConfiguration.getRegion() + " " + regionInfoConfiguration.getVersion();
    }

    @RequestMapping("/courses")
    public Course getEndPoint(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) final String name,
            @RequestParam(name = "chapterCount", defaultValue = "2", required = false) final int chapterCount) {

        return new Course(name, chapterCount);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register/course")
    public String saveCourse(@RequestBody final Course course) {

        return course.getName();
    }
}
