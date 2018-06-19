package com.kodilla.kodillapatterns22.decorator.taxiportal;


import java.math.BigDecimal;

public class UberNetworkOrderDecorator extends AbstractTaxiOrderDecorator {

    public UberNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Uber Network";
    }

}
