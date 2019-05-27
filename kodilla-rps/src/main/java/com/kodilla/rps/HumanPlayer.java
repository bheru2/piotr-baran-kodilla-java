package com.kodilla.rps;

public class HumanPlayer implements Player {
    private ChooseMove chooseMove;
    private String name;
    private int score;

    public HumanPlayer() {
    }

    public ChooseMove getChooseMove() {
        return chooseMove;
    }

    public void setChooseMove(ChooseMove chooseMove) {
        this.chooseMove = chooseMove;
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
