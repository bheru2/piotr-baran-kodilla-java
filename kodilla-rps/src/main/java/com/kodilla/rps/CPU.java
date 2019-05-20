package com.kodilla.rps;

import java.util.Random;

public class CPU {
    private Item item;
    private int score;

    public Item getItem() {
        return item;
    }

     public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void itemGenerator(){
        Random random = new Random();
        int  itemNumber = random.nextInt(5);
        switch (itemNumber){
            case 0:
                this.item = Item.ROCK;
                break;
            case 1:
                this.item = Item.SCISSORS;
                break;
            case 2:
                this.item = Item.SPOCK;
                break;
            case 3:
                this.item = Item.PAPER;
                break;
            case 4:
                this.item = Item.LIZARD;
                break;
        }
    }

    @Override
    public String toString() {
        return "CPU{" +
                "item=" + item +
                ", score=" + score +
                '}';
    }
}
