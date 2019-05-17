package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class User {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public User() {
        char sex;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sex = 'M';
            } else {
                sex = 'F';
            }
            this.forumUsers.add(new ForumUser(i, "User " + i, sex, LocalDate.of(2000 + i, 10, 12), i * 10));
        }
    }

    public List<ForumUser> getForumUsers(){
        return new ArrayList<>(this.forumUsers);
    }
}
