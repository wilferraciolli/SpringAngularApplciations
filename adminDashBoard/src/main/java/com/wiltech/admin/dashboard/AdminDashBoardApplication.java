package com.wiltech.admin.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.wiltech.admin.dashboard.repositories")
@EntityScan(basePackages = "com.wiltech.admin.dashboard.entities")
public class AdminDashBoardApplication {

    public static void main(final String[] args) {
        SpringApplication.run(AdminDashBoardApplication.class, args);
    }

}
