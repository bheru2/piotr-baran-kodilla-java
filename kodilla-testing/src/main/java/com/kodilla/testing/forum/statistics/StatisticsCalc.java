package com.kodilla.testing.forum.statistics;

public class StatisticsCalc {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (statistics.usersNames().size() != 0){
            averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
            averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        }
        if (statistics.postsCount() != 0) {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsPerPost = 0;
        }
    }

    public void ShowStatistics(){
        System.out.println("number of users : " + numberOfUsers);
        System.out.println("number of posts : " + numberOfPosts);
        System.out.println("number of comments : " + numberOfComments);
        System.out.println("average posts per user : " + averagePostsPerUser);
        System.out.println("average comments per user : " + averageCommentsPerUser);
        System.out.println("average comments per post : " + averageCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
