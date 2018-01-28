package com.kodilla.testing.forum.statistics;

public class CalculateForumStatistics {

        private int numberOfPosts;
        private int numberOfComments;
        private int numberOfUsers;
        private double avgPostPerUser;
        private double avgCommentPerUser;
        private double avgCommentPerPost;


        public int getNumberOfUsers () {
            return numberOfUsers;
        }

        public int getNumberOfComments () {
            return numberOfComments;
        }

        public int getNumberOfPosts () {
            return numberOfPosts;
        }

        public double getNumberOfAvgPostPerUser () {
            return avgPostPerUser;
        }

        public double getNumberOfAvgCommentPerUser () {
            return avgCommentPerUser;
        }

        public double getNumberOfAvgCommentPerPost () {
            return avgCommentPerPost;
        }

        public void calculateAdvStatistics (Statistics statistics) {

            numberOfUsers = statistics.usersNames().size();
            numberOfPosts = statistics.postsCount();
            numberOfComments = statistics.commentsCount();

            if (statistics.usersNames().size() !=0 && statistics.postsCount() != 0) {

                avgPostPerUser = (double)(statistics.postsCount())/(statistics.usersNames().size());

            } else {
                avgPostPerUser = 0;
            }

            if(statistics.usersNames().size() !=0 && statistics.commentsCount() != 0) {

                avgCommentPerUser = (double)(statistics.commentsCount())/(statistics.usersNames().size());

            } else {
                avgCommentPerUser = 0;
            }

            if (statistics.commentsCount() !=0 && statistics.postsCount() != 0) {

                avgCommentPerPost = (double) (statistics.commentsCount())/(statistics.postsCount());

            } else {
                avgCommentPerPost = 0;
            }
        }
    }
