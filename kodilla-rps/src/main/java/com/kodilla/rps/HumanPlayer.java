package com.kodilla.rps;

public class HumanPlayer implements Player{
    private Item item;
    private String name;
    private int score;

    public HumanPlayer() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        this.score++;
    }
}
