package com.kodilla.stream.lambdaTwo;

public class CheckIfSinger implements CheckTalent {
    @Override
    public boolean test(Celebrity celebrity) {
        return celebrity.canSing();
    }
}
