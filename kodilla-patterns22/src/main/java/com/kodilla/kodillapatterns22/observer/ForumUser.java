package com.kodilla.kodillapatterns22.observer;

public class ForumUser implements Observer {
    private final String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }

    //update wywoływały obiekty implementujące interfejs Observable
    // podczas zmian (czyli podczas dodawania nowych postów w grupach).

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + " New message in topic: "
                + forumTopic.getName()
                + "\n" + " (total: "
                + forumTopic.getMessages().size()
                + " messages)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public String getUsername() {
        return username;
    }
}
