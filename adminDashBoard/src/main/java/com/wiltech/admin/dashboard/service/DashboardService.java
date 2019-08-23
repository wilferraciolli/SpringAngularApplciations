package com.wiltech.admin.dashboard.service;

import java.util.HashMap;
import java.util.List;

import com.wiltech.admin.dashboard.entities.EmployeeInformation;
import com.wiltech.admin.dashboard.entities.OrderCollectionStatus;
import com.wiltech.admin.dashboard.entities.OrderRecieved;
import com.wiltech.admin.dashboard.entities.ProductCategory;

public interface DashboardService {

    HashMap<String, Object> getTodayRevenueDash();

    List<ProductCategory> getBestCategory();

    List<OrderRecieved> getAllOrderRecieved();

    List<OrderCollectionStatus> getOrderCollection();

    List<EmployeeInformation> getAllEmployee();

    EmployeeInformation getEmployee(final String pk);

    EmployeeInformation addEmployee(EmployeeInformation employeeInformation);

    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);

    void deleteEmployee(EmployeeInformation employeeInformation);

}
