package com.wiltech.admin.dashboard.regioninfo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("regioninfo")
public class RegionInfoConfiguration {

    private String region;
    private Integer version;

    public RegionInfoConfiguration() {
    }

    public RegionInfoConfiguration(final String region, final Integer version) {
        this.region = region;
        this.version = version;
    }
}
