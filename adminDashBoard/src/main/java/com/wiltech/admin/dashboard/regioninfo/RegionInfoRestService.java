/*
 * (c) Midland Software Limited 2019
 * Name     : RestController.java
 * Author   : ferraciolliw
 * Date     : 23 Aug 2019
 */
package com.wiltech.admin.dashboard.regioninfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionInfoRestService {

    @Autowired
    private RegionInfoConfiguration regionInfoConfiguration;

    @RequestMapping("/regioninfo")
    public String getRegionInfo() {

        return regionInfoConfiguration.getRegion() + " " + regionInfoConfiguration.getVersion();
    }

}
