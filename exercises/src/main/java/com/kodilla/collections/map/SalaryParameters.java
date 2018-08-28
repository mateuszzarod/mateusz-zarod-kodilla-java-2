package com.kodilla.collections.map;

public class SalaryParameters{
        Double baseSalary;
        Double regulatedBonus;
        Double chefBonus;
        Double functionAddSalary;

        public SalaryParameters(Double baseSalary, Double regulatedBonus, Double chefBonus, Double
                functionAddSalary){
            this.baseSalary = baseSalary;
            this.regulatedBonus = regulatedBonus;
            this.chefBonus = chefBonus;
            this.functionAddSalary = functionAddSalary;
        }
        public String toString(){
            return baseSalary + " + " + regulatedBonus + " + " +
                    chefBonus + " + " + functionAddSalary;
        }
    }
