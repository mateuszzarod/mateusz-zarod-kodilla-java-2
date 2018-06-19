package com.kodilla.kodillapatterns22.decorator.taxiportal;

import java.math.BigDecimal;

public class VipDecorator extends AbstractTaxiOrderDecorator {

    public VipDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + variant VIP";
    }
}
