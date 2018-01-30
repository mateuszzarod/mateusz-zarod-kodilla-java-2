package com.kodilla.testing.forum.statistics;
public class CalculateForumStatistics {
    private int numberOfPosts;
    private int numberOfComments;
    private int numberOfUsers;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    public CalculateForumStatistics() {
    }

    public int getNumberOfUsers() {

        return this.numberOfUsers;
    }

    public int getNumberOfComments() {

        return this.numberOfComments;
    }

    public int getNumberOfPosts() {

        return this.numberOfPosts;
    }

    public double getNumberOfAvgPostPerUser() {

        return this.avgPostPerUser;
    }

    public double getNumberOfAvgCommentPerUser() {

        return this.avgCommentPerUser;
    }

    public double getNumberOfAvgCommentPerPost() {

        return this.avgCommentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        if (statistics.usersNames().size() != 0 && statistics.postsCount() != 0) {
            this.avgPostPerUser = (double)statistics.postsCount() / (double)statistics.usersNames().size();
        } else {
            this.avgPostPerUser = 0.0;
        }

        if (statistics.usersNames().size() != 0 && statistics.commentsCount() != 0) {
            this.avgCommentPerUser = (double)statistics.commentsCount() / (double)statistics.usersNames().size();
        } else {
            this.avgCommentPerUser = 0.0;
        }

        if (statistics.commentsCount() != 0 && statistics.postsCount() != 0) {
            this.avgCommentPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
        } else {
            this.avgCommentPerPost = 0.0;
        }

    }
}
