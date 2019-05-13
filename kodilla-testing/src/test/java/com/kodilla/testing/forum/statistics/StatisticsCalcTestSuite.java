package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalcTestSuite {

    @Test
    public void testNoPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userList = new LinkedList<String>();
        for(int i = 0 ; i<100; i++){
            userList.add("A"+i);
        }

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalc statisticsCalc = new StatisticsCalc();
        statisticsCalc.calculateAdvStatistics(statisticsMock);
        //When
        int usersCount = statisticsCalc.getNumberOfUsers();
        int postCount = statisticsCalc.getNumberOfPosts();
        int commentsCount = statisticsCalc.getNumberOfComments();
        int postOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnPost = statisticsCalc.getAverageCommentsPerPost();
        //Then
        assertEquals(100, usersCount);
        assertEquals(0, postCount);
        assertEquals(10, commentsCount);
        assertEquals(0,postOnUser);
        assertEquals(0, commentsOnUser);
        assertEquals(0, commentsOnPost);
    }

    @Test
    public void test1000Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userList = new LinkedList<String>();
        for(int i = 0 ; i<10; i++){
            userList.add("A"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalc statisticsCalc = new StatisticsCalc();
        statisticsCalc.calculateAdvStatistics(statisticsMock);
        //When
        int usersCount = statisticsCalc.getNumberOfUsers();
        int postCount = statisticsCalc.getNumberOfPosts();
        int commentsCount = statisticsCalc.getNumberOfComments();
        int postOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnPost = statisticsCalc.getAverageCommentsPerPost();
        //Then
        assertEquals(10, usersCount);
        assertEquals(1000, postCount);
        assertEquals(100, commentsCount);
        assertEquals(100,postOnUser);
        assertEquals(10, commentsOnUser);
        assertEquals(0, commentsOnPost);
    }

    @Test
    public void testNoComms(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userList = new LinkedList<String>();
        for(int i = 0 ; i<10; i++){
            userList.add("A"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalc statisticsCalc = new StatisticsCalc();
        statisticsCalc.calculateAdvStatistics(statisticsMock);
        //When
        int usersCount = statisticsCalc.getNumberOfUsers();
        int postCount = statisticsCalc.getNumberOfPosts();
        int commentsCount = statisticsCalc.getNumberOfComments();
        int postOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnPost = statisticsCalc.getAverageCommentsPerPost();
        //Then
        assertEquals(10, usersCount);
        assertEquals(10, postCount);
        assertEquals(0, commentsCount);
        assertEquals(1,postOnUser);
        assertEquals(0, commentsOnUser);
        assertEquals(0, commentsOnPost);
    }

    @Test
    public void testCommsLowThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userList = new LinkedList<String>();
        for(int i = 0 ; i<10; i++){
            userList.add("A"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalc statisticsCalc = new StatisticsCalc();
        statisticsCalc.calculateAdvStatistics(statisticsMock);
        //When
        int usersCount = statisticsCalc.getNumberOfUsers();
        int postCount = statisticsCalc.getNumberOfPosts();
        int commentsCount = statisticsCalc.getNumberOfComments();
        int postOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnPost = statisticsCalc.getAverageCommentsPerPost();
        //Then
        assertEquals(10, usersCount);
        assertEquals(100, postCount);
        assertEquals(10, commentsCount);
        assertEquals(10,postOnUser);
        assertEquals(1, commentsOnUser);
        assertEquals(0, commentsOnPost);
    }

    @Test
    public void testCommsMoreThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userList = new LinkedList<String>();
        for(int i = 0 ; i<10; i++){
            userList.add("A"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalc statisticsCalc = new StatisticsCalc();
        statisticsCalc.calculateAdvStatistics(statisticsMock);
        //When
        int usersCount = statisticsCalc.getNumberOfUsers();
        int postCount = statisticsCalc.getNumberOfPosts();
        int commentsCount = statisticsCalc.getNumberOfComments();
        int postOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnPost = statisticsCalc.getAverageCommentsPerPost();
        //Then
        assertEquals(10, usersCount);
        assertEquals(10, postCount);
        assertEquals(100, commentsCount);
        assertEquals(1,postOnUser);
        assertEquals(10, commentsOnUser);
        assertEquals(10, commentsOnPost);
    }

    @Test
    public void testNoUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userList = new LinkedList<String>();

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalc statisticsCalc = new StatisticsCalc();
        statisticsCalc.calculateAdvStatistics(statisticsMock);
        //When
        int usersCount = statisticsCalc.getNumberOfUsers();
        int postCount = statisticsCalc.getNumberOfPosts();
        int commentsCount = statisticsCalc.getNumberOfComments();
        int postOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnPost = statisticsCalc.getAverageCommentsPerPost();
        //Then
        assertEquals(0, usersCount);
        assertEquals(10, postCount);
        assertEquals(10, commentsCount);
        assertEquals(0,postOnUser);
        assertEquals(0, commentsOnUser);
        assertEquals(1, commentsOnPost);
    }

    @Test
    public void test100Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userList = new LinkedList<String>();
        for(int i = 0 ; i<100; i++){
            userList.add("A"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalc statisticsCalc = new StatisticsCalc();
        statisticsCalc.calculateAdvStatistics(statisticsMock);
        //When
        int usersCount = statisticsCalc.getNumberOfUsers();
        int postCount = statisticsCalc.getNumberOfPosts();
        int commentsCount = statisticsCalc.getNumberOfComments();
        int postOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnUser = statisticsCalc.getAveragePostsPerUser();
        int commentsOnPost = statisticsCalc.getAverageCommentsPerPost();
        //Then
        assertEquals(100, usersCount);
        assertEquals(100, postCount);
        assertEquals(100, commentsCount);
        assertEquals(1,postOnUser);
        assertEquals(1, commentsOnUser);
        assertEquals(1, commentsOnPost);
    }
}
