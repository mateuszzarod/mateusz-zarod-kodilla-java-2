package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest

public class DataFinderFacadeTestSuite{

    @Autowired
    DataFinderFacade dataFinderFacade;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    @Test
    public void testFindByAnyPartOfNameCompany() throws NotFoundException {
        //given
        Company orlen = new Company("orlen");
        Company lotos = new Company("lotos");
        Company lotosPaliwa = new Company("lotos paliwa");

        companyDao.save(orlen);
        int id1 = orlen.getId();

        companyDao.save(lotos);
        int id2 = lotos.getId();

        companyDao.save(lotosPaliwa);
        int id3 = lotosPaliwa.getId();

        //when
        List<Company> searchingCompany1 =dataFinderFacade.findCompanyByPartialName("orl");
        List<Company> searchingCompany2 =dataFinderFacade.findCompanyByPartialName("tos");

        //then
        Assert.assertEquals(1, searchingCompany1.size());
        Assert.assertEquals(2, searchingCompany2.size());

        //CleanUp
        try {
            companyDao.delete(id1);
            companyDao.delete(id2);
            companyDao.delete(id3);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindByAnyPartOfNameEmployee() throws NotFoundException {
        //given
        Employee adamNowak = new Employee("Adam", "Nowak");
        Employee adrianRaczynski= new Employee("Mateusz", "Zaród");
        Employee magdaNowak = new Employee("Magda", "Nowak");

        employeeDao.save(adamNowak);
        int id4 = adamNowak.getId();

        employeeDao.save(adrianRaczynski);
        int id5 = adrianRaczynski.getId();

        employeeDao.save(magdaNowak);
        int id6 = magdaNowak.getId();

        //when
        List<Employee> searchingEmployee1 = dataFinderFacade.findEmployeeByPartialName("Zar");
        List<Employee> searchingEmployee2  = dataFinderFacade.findEmployeeByPartialName("Now");

        //then
        Assert.assertEquals(1, searchingEmployee1.size());
        Assert.assertEquals(2, searchingEmployee2.size());

        //CleanUp
        try {
            employeeDao.delete(id4);
            employeeDao.delete(id5);
            employeeDao.delete(id6);
        } catch (Exception e) {
            //do nothing
        }
    }
}