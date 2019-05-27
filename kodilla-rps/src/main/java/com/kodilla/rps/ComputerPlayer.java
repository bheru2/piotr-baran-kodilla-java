package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer implements Player {
    private ChooseMove chooseMove;
    private int score;
    private Random random = new Random();

    public ChooseMove getChooseMove() {
        return chooseMove;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        this.score++;
    }

    public ChooseMove itemGenerator(boolean easyLevel){
        if (easyLevel){
            this.chooseMove = chooseMove.values()[this.random.nextInt(chooseMove.values().length)];
            return this.chooseMove;
        }
        this.chooseMove = chooseMove.values()[this.random.nextInt(chooseMove.values().length-2)];
        return this.chooseMove;
    }
}
