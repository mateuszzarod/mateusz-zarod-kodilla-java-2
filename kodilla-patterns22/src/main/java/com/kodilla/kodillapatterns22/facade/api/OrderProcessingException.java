package com.kodilla.kodillapatterns22.facade.api;

public class OrderProcessingException extends Exception{

    public static String ERR_NOT_AUTORIZED = "User is not authorised";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERIFICATION_ERROR= "Verification error";
    public static String ERR_SUBMITTING_ERROR= "Cannot submit order";

    public OrderProcessingException(String message) {
        super(message);
    }
}