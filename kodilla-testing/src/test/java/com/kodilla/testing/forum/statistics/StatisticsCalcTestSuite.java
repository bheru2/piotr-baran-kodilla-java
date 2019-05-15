package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StatisticsCalcTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    public void testZeroNumberOfPosts() {
        //Given
        List<String> userList = generateUsersName(10);
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        statisticsCalc.calculateAdvStatistics();
        //When
        double actualAveragePostsPerUser = statisticsCalc.getAveragePostsPerUser();
        double actualAverageCommentsPerPost = statisticsCalc.getAverageCommentsPerPost();
        double actualAverageCommentsPerUser = statisticsCalc.getAverageCommentsPerUser();
        //Then
        assertEquals(0, actualAverageCommentsPerUser, 2);
        assertEquals(0, actualAverageCommentsPerPost, 2);
        assertEquals(0, actualAveragePostsPerUser, 2);
    }

    @Test
    public void test1000NumberOfPosts() {
        //Given
        List<String> userList = generateUsersName(50);
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        statisticsCalc.calculateAdvStatistics();
        //When
        double actualAveragePostsPerUser = statisticsCalc.getAveragePostsPerUser();
        //Then
        assertEquals(20, actualAveragePostsPerUser, 2);
    }

    @Test
    public void testZeroNumberOfComments() {
        //Given
        List<String> userList = generateUsersName(50);
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        statisticsCalc.calculateAdvStatistics();
        //When
        double actualAverageCommentsPerUser = statisticsCalc.getAverageCommentsPerUser();
        double actualAverageCommentsPerPost = statisticsCalc.getAverageCommentsPerPost();
        //Then
        assertEquals(0, actualAverageCommentsPerUser, 2);
        assertEquals(0, actualAverageCommentsPerPost, 2);
    }

    @Test
    public void testNumberOfCommentsIsGraterThanNumberOfPosts() {
        //Given
        List<String> userList = generateUsersName(1);
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(2);
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        statisticsCalc.calculateAdvStatistics();
        //When
        double actualAverageCommentsPerUser = statisticsCalc.getAverageCommentsPerUser();
        double actualAverageCommentsPerPost = statisticsCalc.getAverageCommentsPerPost();
        double actualAveragePostsPerUser = statisticsCalc.getAveragePostsPerUser();
        //Then
        assertEquals(10, actualAverageCommentsPerUser, 2);
        assertEquals(5, actualAverageCommentsPerPost, 2);
        assertEquals(2, actualAveragePostsPerUser, 2);
    }

    @Test
    public void testNumberOfCommentsIsSmallerThanNumberOfPosts() {
        //Given
        List<String> userList = generateUsersName(1);
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(4);
        when(statisticsMock.postsCount()).thenReturn(8);
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        statisticsCalc.calculateAdvStatistics();
        //When
        double actualAverageCommentsPerUser = statisticsCalc.getAverageCommentsPerUser();
        double actualAverageCommentsPerPost = statisticsCalc.getAverageCommentsPerPost();
        double actualAveragePostsPerUser = statisticsCalc.getAveragePostsPerUser();
        //Then
        assertEquals(4, actualAverageCommentsPerUser, 2);
        assertEquals(0.5, actualAverageCommentsPerPost, 2);
        assertEquals(8, actualAveragePostsPerUser, 2);
    }

    @Test
    public void testZeroNumbersOfUsers() {
        //Given
        List<String> userList = generateUsersName(0);
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        statisticsCalc.calculateAdvStatistics();
        //When
        double actualAverageCommentsPerUser = statisticsCalc.getAverageCommentsPerUser();
        double actualAverageCommentsPerPost = statisticsCalc.getAverageCommentsPerPost();
        double actualAveragePostsPerUser = statisticsCalc.getAveragePostsPerUser();
        //Then
        assertEquals(0, actualAverageCommentsPerUser, 2);
        assertEquals(0, actualAverageCommentsPerPost, 2);
        assertEquals(0, actualAveragePostsPerUser, 2);
    }

    @Test
    public void test100NumbersOfUsers() {
        //Given
        List<String> userList = generateUsersName(100);
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        statisticsCalc.calculateAdvStatistics();
        //When
        double actualAverageCommentsPerUser = statisticsCalc.getAverageCommentsPerUser();
        double actualAverageCommentsPerPost = statisticsCalc.getAverageCommentsPerPost();
        double actualAveragePostsPerUser = statisticsCalc.getAveragePostsPerUser();
        //Then
        assertEquals(10, actualAverageCommentsPerUser, 2);
        assertEquals(10, actualAverageCommentsPerPost, 2);
        assertEquals(1, actualAveragePostsPerUser, 2);
    }

    private List<String> generateUsersName(int usersNumber) {
        List<String> userList = new ArrayList<>();
        for (int i = 0; i < usersNumber; i++) {
            userList.add("User " + i);
        }
        return userList;
    }
}
