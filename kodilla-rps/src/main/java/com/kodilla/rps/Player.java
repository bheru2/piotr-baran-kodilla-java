package com.kodilla.rps;

public class Player {
    private Item item;
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "item=" + item +
                ", name='" + name + '\'' +
                '}';
    }
}
