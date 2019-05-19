package com.kodilla.testing.forum.statistics;

public class StatisticsCalc {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public StatisticsCalc(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        if (this.numberOfUsers != 0 && this.numberOfPosts != 0) {
            this.averagePostsPerUser = this.numberOfPosts / this.numberOfUsers;
            this.averageCommentsPerUser = this.numberOfComments / this.numberOfUsers;
            this.averageCommentsPerPost = this.numberOfComments / this.numberOfPosts;
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

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
