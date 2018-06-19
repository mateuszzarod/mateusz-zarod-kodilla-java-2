package com.kodilla.kodillapatterns22.decorator.taxiportal;


import java.math.BigDecimal;

public class ExpressDecorator extends AbstractTaxiOrderDecorator {

    public ExpressDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + express service";
    }
}