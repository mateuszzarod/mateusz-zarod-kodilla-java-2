package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
                //try {
            //    companyDao.delete(softwareMachineId);
            //    companyDao.delete(dataMaestersId);
            //    companyDao.delete(greyMatterId);
            //} catch (Exception e) {
            //    //do nothing
            //}
        }

    @Test
    public void namedQueriesTestSuite(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee zenonPawlak = new Employee("Zenon", "Pawlak");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(stephanieClarckson);
        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(softwareMachine);

        dataMaesters.getEmployees().add(lindaKovalsky);
        dataMaesters.getEmployees().add(zenonPawlak);
        lindaKovalsky.getCompanies().add(dataMaesters);
        zenonPawlak.getCompanies().add(dataMaesters);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();
        employeeDao.save(zenonPawlak);
        int zenonPawlakId = zenonPawlak.getId();

        //When
        List<Employee> retrieveLastNameOfEmployee = employeeDao.retrieveLastNameOfEmployee("Pawlak");
        List<Company> retrieveFirstThreeChar = companyDao.retrieveFirstThreeChar("Sof");
        //first free

        //Then
        try {
            Assert.assertEquals(1, retrieveLastNameOfEmployee.size());
            Assert.assertEquals(1, retrieveFirstThreeChar.size());
        } catch (Exception e){

        }
    }
    }