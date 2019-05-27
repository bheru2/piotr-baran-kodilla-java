package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum(UserGenerator.generateForumUsers(20));
        Map<Integer, ForumUser> result = forum.getForumUsers().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBorn().getYear() > 1999)
                .filter(user -> user.getPostNumber() > 40)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        result.entrySet().stream().map(entry -> entry.getKey() + " : " + entry.getValue()).forEach(System.out::println);
    }
}
