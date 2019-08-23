package com.wiltech.admin.dashboard.service.impl;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiltech.admin.dashboard.entities.CompanyRevenue;
import com.wiltech.admin.dashboard.entities.EmployeeInformation;
import com.wiltech.admin.dashboard.entities.OrderCollectionStatus;
import com.wiltech.admin.dashboard.entities.OrderRecieved;
import com.wiltech.admin.dashboard.entities.ProductCategory;
import com.wiltech.admin.dashboard.repositories.CompanyRevenueRepository;
import com.wiltech.admin.dashboard.repositories.EmployeeInformationRepository;
import com.wiltech.admin.dashboard.repositories.OrderCollectionStatusRepository;
import com.wiltech.admin.dashboard.repositories.OrderRecievedRepository;
import com.wiltech.admin.dashboard.repositories.ProductCategoryRepository;
import com.wiltech.admin.dashboard.service.DashboardService;

/**
 * Created by BhupendraKumar on 7/11/18.
 */
@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private CompanyRevenueRepository companyRevenueRepository;

    @Autowired
    private EmployeeInformationRepository employeeInformationRepository;

    @Autowired
    private OrderCollectionStatusRepository orderCollectionStatusRepository;

    @Autowired
    private OrderRecievedRepository orderRecievedRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public HashMap<String, Object> getTodayRevenueDash() {
        final HashMap<String, Object> populateCmpnyRev = new HashMap<>();

        final List<CompanyRevenue> companyRevenueList = companyRevenueRepository.findAll();

        /**
         * Build Labels and Revenue
         */
        final List<String> label = new ArrayList<>();
        final List<String> _revenue = new ArrayList<>();
        double totalMargin = 0;
        double totalExpense = 0;
        double totalRevenue = 0;

        final Locale locale = new Locale("en", "US");
        final NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        for (final CompanyRevenue companyRevenue : companyRevenueList) {
            label.add(companyRevenue.get_month());
            _revenue.add(String.valueOf(companyRevenue.getRevenue()));
            totalExpense = totalExpense + companyRevenue.getExpense();
            totalMargin = totalMargin + companyRevenue.getMargins();
            totalRevenue = totalRevenue + companyRevenue.getRevenue();

        }
        populateCmpnyRev.put("crLabels", label.toString());
        populateCmpnyRev.put("crRevenue", _revenue.toString());
        populateCmpnyRev.put("totalExpense", currencyFormatter.format(totalExpense));
        populateCmpnyRev.put("totalMargin", currencyFormatter.format(totalMargin));
        populateCmpnyRev.put("totalRevenue", currencyFormatter.format(totalRevenue));

        return populateCmpnyRev;
    }

    @Override
    public List<ProductCategory> getBestCategory() {
        return productCategoryRepository.findByBestCategory(true);
    }

    @Override
    public List<OrderRecieved> getAllOrderRecieved() {
        return orderRecievedRepository.findAll();
    }

    @Override
    public List<OrderCollectionStatus> getOrderCollection() {
        return orderCollectionStatusRepository.findAll();
    }

    @Override
    public List<EmployeeInformation> getAllEmployee() {
        return employeeInformationRepository.findAll();
    }

    @Override
    public EmployeeInformation getEmployee(final String pk) {
        return employeeInformationRepository.findByPk(pk);
    }

    @Override
    public EmployeeInformation addEmployee(final EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public EmployeeInformation updateEmployee(final EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public void deleteEmployee(final EmployeeInformation employeeInformation) {
        employeeInformationRepository.delete(employeeInformation);
    }
}
