package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers;

    public Forum(List<ForumUser> forumUsers) {
        this.forumUsers = forumUsers;
    }

    public List<ForumUser> getForumUsers() {
        return new ArrayList<>(this.forumUsers);
    }
}
