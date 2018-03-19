package com.kodilla.patterns.strategy.social;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

public class SocialTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mill = new Millenials("Stefan Milenials");
        User ygen = new YGeneration("Roman Y");
        User zgen = new ZGeneration("Mieczysław Z");

        //When
        String millShare = mill.sharePost();
        System.out.println("Mill is posting" + millShare);
        String ygenShare = ygen.sharePost();
        System.out.println("Ygen is posting" + ygenShare);
        String zgenShare = zgen.sharePost();
        System.out.println("Zgen is posting" + zgenShare);

        //Then
        Assert.assertEquals("Im sharing Facebook", millShare);
        Assert.assertEquals("Im sharing Twitter", ygenShare);
        Assert.assertEquals("Im sharing Snapchat", zgenShare);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        User mill = new Millenials("Stefan Milenials");
        User ygen = new YGeneration("Roman Y");
        User zgen = new ZGeneration("Mieczysław Z");


        //When
        String millShare = mill.sharePost();
        System.out.println("Mill is posting" + millShare);
        mill.setSocialPublisher(new SnapchatPublisher());
        System.out.println("Mill is posting" + millShare);
        millShare = mill.sharePost();

        String ygenShare = ygen.sharePost();
        System.out.println("ygen is posting" + ygenShare);
        ygen.setSocialPublisher(new SnapchatPublisher());
        System.out.println("ygen is posting" + ygenShare);
        ygenShare = ygen.sharePost();

        String zgenShare = zgen.sharePost();
        System.out.println("zgen is posting" + zgenShare);
        zgen.setSocialPublisher(new FacebookPublisher());
        zgenShare = zgen.sharePost();

        System.out.println(zgenShare);

        //Then
        Assert.assertEquals("Im sharing Snapchat", millShare);
        Assert.assertEquals("Im sharing Snapchat", ygenShare);
        Assert.assertEquals("Im sharing Facebook", zgenShare);
    }
}
