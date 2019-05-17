package com.kodilla.stream.beautifier;

import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.User;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        User users = new User();
        Map<Integer, ForumUser> result = users.getForumUsers().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBorn().getYear() > 1999)
                .filter(user -> user.getPostNumber() > 40)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        result.entrySet().stream().map(entry -> entry.getKey() + " : " + entry.getValue()).forEach(System.out::println);
    }
}
