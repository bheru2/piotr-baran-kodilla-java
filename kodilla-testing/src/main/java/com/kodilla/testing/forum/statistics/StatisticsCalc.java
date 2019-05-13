package com.kodilla.testing.forum.statistics;

public class StatisticsCalc {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        if (statistics.usersNames().size() !=0 && (statistics.postsCount() != 0)){
            this.averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
            this.averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
            this.averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        } else {
            this.averagePostsPerUser = 0;
            this.averageCommentsPerUser = 0;
            this.averageCommentsPerPost = 0;
        }
    }

    public void ShowStatistics() {
        System.out.println("number of users : " + this.numberOfUsers);
        System.out.println("number of posts : " + this.numberOfPosts);
        System.out.println("number of comments : " + this.numberOfComments);
        System.out.println("average posts per user : " + this.averagePostsPerUser);
        System.out.println("average comments per user : " + this.averageCommentsPerUser);
        System.out.println("average comments per post : " + this.averageCommentsPerPost);
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

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
