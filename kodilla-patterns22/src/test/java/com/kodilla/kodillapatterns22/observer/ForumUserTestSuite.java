package com.kodilla.kodillapatterns22.observer;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {

        //given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();

        ForumUser janKowalski = new ForumUser("Jan Kowalski");
        ForumUser grzegorzSzymus = new ForumUser("Grzegorz Szymuś");
        ForumUser andrzejNowak = new ForumUser("Andrzej Nowak");

        javaHelpForum.registerObserver(janKowalski);
        javaToolsForum.registerObserver(grzegorzSzymus);
        javaHelpForum.registerObserver(andrzejNowak);
        javaToolsForum.registerObserver(andrzejNowak);

        //when
        javaHelpForum.addPost("Hi every one! Could you help me with this loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, my database SQL doesn't want to work :-(");
        javaHelpForum.addPost("Why while ? Is it better?");
        javaToolsForum.addPost("When i try to log in I got 'bed credential' messege");

        //then
        Assert.assertEquals(3, janKowalski.getUpdateCount());
        Assert.assertEquals(2, grzegorzSzymus.getUpdateCount());
        Assert.assertEquals(5, andrzejNowak.getUpdateCount());
    }
}