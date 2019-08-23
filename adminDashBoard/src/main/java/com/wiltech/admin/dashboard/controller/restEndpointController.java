package com.wiltech.admin.dashboard.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class restEndpointController {
    //
    //    @Autowired
    //    private DashboardService dashboardService;
    //
    //    @RequestMapping("/employees")
    //    public List<EmployeeInformation> getAllEmp() {
    //        return dashboardService.getAllEmployee();
    //    }
    //
    //    @RequestMapping(method = RequestMethod.POST, value = "/employee/add")
    //    public String saveEmployeeInfo(@RequestBody final EmployeeInformation employeeInformation) {
    //        if (dashboardService.addEmployee(employeeInformation) != null) {
    //            return "Employee data saved successfully";
    //        } else {
    //            return "Error saving employee info";
    //        }
    //    }
    //
    //    @RequestMapping(method = RequestMethod.PUT, value = "/employee/delete")
    //    public String deleteEmp(@RequestParam(name = "empId", required = true) final String pk) {
    //        try {
    //            dashboardService.deleteEmployee(dashboardService.getEmployee(pk));
    //            return "deleted";
    //        } catch (final Exception e) {
    //            return "error";
    //        }
    //    }

}
