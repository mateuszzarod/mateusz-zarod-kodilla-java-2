package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataFinderFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataFinderFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;


    public List<Company> findCompanyByPartialName (String partialName){
        return companyDao.retrieveCompanyByPartialName("%" + partialName + "%");
    }

    public List<Employee> findEmployeeByPartialName (String partialName){
        return employeeDao.retrieveEmployeeByPartialName("%" + partialName + "%");
    }
}
