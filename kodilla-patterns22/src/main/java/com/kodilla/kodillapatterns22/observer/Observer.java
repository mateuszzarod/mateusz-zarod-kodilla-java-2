package com.kodilla.kodillapatterns22.observer;

public interface Observer {

    // update - passes ForumTipic and it will be called every time a new post is written
    // every observer/subscriber implements this interface
    void update(ForumTopic forumTopic);
}
