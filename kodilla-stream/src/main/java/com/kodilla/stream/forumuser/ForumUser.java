package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBorn;
    private final int postNumber;

    public ForumUser(int userID, String userName, char sex, LocalDate dateOfBorn, int postNumber) {
        if (sex != 'M' && sex != 'F') {
            throw new IllegalArgumentException("The sex should be selected from 'M' or 'F'");
        }
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBorn = dateOfBorn;
        this.postNumber = postNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBorn() {
        return dateOfBorn;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBorn=" + dateOfBorn +
                ", postNumber=" + postNumber +
                '}';
    }
}
