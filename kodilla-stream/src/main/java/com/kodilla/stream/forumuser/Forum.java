package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers;
    private final int numbersOfUsers;

    public Forum(int numbersOfUsers) {
        this.numbersOfUsers = numbersOfUsers;
        this.forumUsers = generateForumUsers();
    }

    public List<ForumUser> getForumUsers() {
        return new ArrayList<>(this.forumUsers);
    }

    private List<ForumUser> generateForumUsers() {
        char sex;
        List<ForumUser> forumUsers = new ArrayList<>();
        for (int i = 1; i <= this.numbersOfUsers; i++) {
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
