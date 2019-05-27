package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class MoveList {
    private Map<Move, Result> allMove;

    public MoveList() {
        this.allMove = new HashMap<>();
        allMove.put(new Move(ChooseMove.ROCK, ChooseMove.ROCK), Result.DRAW);
        allMove.put(new Move(ChooseMove.ROCK, ChooseMove.SPOCK), Result.LOST);
        allMove.put(new Move(ChooseMove.ROCK, ChooseMove.SCISSORS), Result.WIN);
        allMove.put(new Move(ChooseMove.ROCK, ChooseMove.LIZARD), Result.WIN);
        allMove.put(new Move(ChooseMove.ROCK, ChooseMove.PAPER), Result.LOST);

        allMove.put(new Move(ChooseMove.SCISSORS, ChooseMove.ROCK), Result.LOST);
        allMove.put(new Move(ChooseMove.SCISSORS, ChooseMove.SPOCK), Result.WIN);
        allMove.put(new Move(ChooseMove.SCISSORS, ChooseMove.SCISSORS), Result.DRAW);
        allMove.put(new Move(ChooseMove.SCISSORS, ChooseMove.LIZARD), Result.LOST);
        allMove.put(new Move(ChooseMove.SCISSORS, ChooseMove.PAPER), Result.WIN);

        allMove.put(new Move(ChooseMove.PAPER, ChooseMove.ROCK), Result.WIN);
        allMove.put(new Move(ChooseMove.PAPER, ChooseMove.SPOCK), Result.WIN);
        allMove.put(new Move(ChooseMove.PAPER, ChooseMove.SCISSORS), Result.LOST);
        allMove.put(new Move(ChooseMove.PAPER, ChooseMove.LIZARD), Result.LOST);
        allMove.put(new Move(ChooseMove.PAPER, ChooseMove.PAPER), Result.DRAW);

        allMove.put(new Move(ChooseMove.SPOCK, ChooseMove.ROCK), Result.WIN);
        allMove.put(new Move(ChooseMove.SPOCK, ChooseMove.SPOCK), Result.DRAW);
        allMove.put(new Move(ChooseMove.SPOCK, ChooseMove.SCISSORS), Result.WIN);
        allMove.put(new Move(ChooseMove.SPOCK, ChooseMove.LIZARD), Result.LOST);
        allMove.put(new Move(ChooseMove.SPOCK, ChooseMove.PAPER), Result.LOST);

        allMove.put(new Move(ChooseMove.LIZARD, ChooseMove.ROCK), Result.LOST);
        allMove.put(new Move(ChooseMove.LIZARD, ChooseMove.SPOCK), Result.WIN);
        allMove.put(new Move(ChooseMove.LIZARD, ChooseMove.SCISSORS), Result.LOST);
        allMove.put(new Move(ChooseMove.LIZARD, ChooseMove.LIZARD), Result.DRAW);
        allMove.put(new Move(ChooseMove.LIZARD, ChooseMove.PAPER), Result.WIN);
    }

    public Result getResult(Move move) {
        return this.allMove.get(move);
    }
}