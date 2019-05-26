package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer implements Player {
    private Item item;
    private int score;
    private Random random = new Random();

    public Item getItem() {
        return item;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        this.score++;
    }

    public Item itemGenerator(boolean easyLevel){
        if (easyLevel){
            this.item = Item.values()[this.random.nextInt(Item.values().length)];
            return this.item;
        }
        this.item = Item.values()[this.random.nextInt(Item.values().length-2)];
        return this.item;
    }
}
