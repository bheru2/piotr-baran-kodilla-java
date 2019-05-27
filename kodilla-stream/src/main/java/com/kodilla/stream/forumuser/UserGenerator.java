package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserGenerator {
    public static List<ForumUser> generateForumUsers(int numbersOfUsers) {
        char sex;
        List<ForumUser> forumUsers = new ArrayList<>();
        for (int i = 1; i <= numbersOfUsers; i++) {
            if (i % 2 == 0) {
                sex = 'M';
            } else {
                sex = 'F';
            }
            forumUsers.add(new ForumUser(i, "User " + i, sex, LocalDate.of(2000 + i, 10, 12), i * 10));
        }
        return forumUsers;
    }
}
