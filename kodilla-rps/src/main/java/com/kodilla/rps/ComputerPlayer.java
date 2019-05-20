package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer implements Player {
    private Item item;
    private int score;
    Random random = new Random();

    public Item getItem() {
        return item;
    }

     public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Item itemGenerator(){
        this.item = Item.values()[this.random.nextInt(Item.values().length)];
        return this.item;
    }
}
