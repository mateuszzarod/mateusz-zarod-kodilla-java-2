package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public void addUser(int userID,  String userName, char gender, LocalDate dateOfBirth, int numberOfPosts){
        usersList.add(new ForumUser(userID, userName, gender, dateOfBirth, numberOfPosts));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(usersList);
    }
}