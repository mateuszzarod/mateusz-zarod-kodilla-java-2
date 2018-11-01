package com.kodilla.kodillapatterns22.adapter.company.company;

import com.kodilla.kodillapatterns22.adapter.company.newhrsystem.Employee;
import com.kodilla.kodillapatterns22.adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//extedns adaptee and implements old system methods
public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator {

    @Override
    //converts old data to format expected by new methods
    public double TotalSalary(String[][] workers, double[] salaries) {
        List<Employee> employeeList = new ArrayList<>();
        for (int n=0; n< salaries.length; n++){
            employeeList.add(new Employee(
                    workers[n][0],
                    workers[n][1],
                    workers[n][2],
                    new BigDecimal(salaries[n])));
        }
        //salaryAdaptee method from new system/expects double
        return calculateSalaries(employeeList).doubleValue();
    }
}
