package com.kodilla.stream.lambdaTwo;

public class CheckIfDancer implements CheckTalent {
    @Override
    public boolean test(Celebrity celebrity) {
        return celebrity.canDance();
    }
}
