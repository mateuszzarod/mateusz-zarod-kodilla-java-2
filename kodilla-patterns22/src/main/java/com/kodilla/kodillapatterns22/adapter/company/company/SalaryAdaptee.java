package com.kodilla.kodillapatterns22.adapter.company.company;

import com.kodilla.kodillapatterns22.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.kodillapatterns22.adapter.company.newhrsystem.Employee;
import com.kodilla.kodillapatterns22.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

//adaptee class implements same interface as new system and wraps its methods
public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        //new system object - method wraps 1:1 method of new system
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }


}
