package com.kodilla.hibernate.manytomany.facade;


public class NotFoundException extends Exception {

    public static String ERR_EMPLOEE_NOT_FOUND = "Employee was not found";
    public static String ERR_COMPANY_NOT_FOUND = "companY was not found";
    public static String ERR_ADD_REJECTED = "Add was rejected";
    public static String ERR_GET_COMPANIES_ERROR = "Cannot get list of companies";
    public static String ERR_GET_EMPLOEES_ERROR = "Cannot get list of employees";

    public NotFoundException(String message) {
        super(message);
    }
}
