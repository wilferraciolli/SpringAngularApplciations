package com.wiltech.admin.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wiltech.admin.dashboard.service.DashboardService;

/**
 * Created by BhupendraKumar on 7/11/18.
 */
@Controller
public class ThymeleafController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/dashboard")
    public String getDashDetail(final Model model) {

        /**
         * Populate Company Revenue Data
         */
        model.addAttribute("cr", dashboardService.getTodayRevenueDash());

        /**
         * Populate the Employees info
         */
        model.addAttribute("ei", dashboardService.getAllEmployee());
        return "/dashboard";
    }

}
