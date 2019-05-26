package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class MoveList {
    private Map<Move, Result> allMove;

    public MoveList() {
        this.allMove = new HashMap<>();
        allMove.put(new Move(Item.ROCK, Item.ROCK), Result.DRAW);
        allMove.put(new Move(Item.ROCK, Item.SPOCK), Result.LOST);
        allMove.put(new Move(Item.ROCK, Item.SCISSORS), Result.WIN);
        allMove.put(new Move(Item.ROCK, Item.LIZARD), Result.WIN);
        allMove.put(new Move(Item.ROCK, Item.PAPER), Result.LOST);

        allMove.put(new Move(Item.SCISSORS, Item.ROCK), Result.LOST);
        allMove.put(new Move(Item.SCISSORS, Item.SPOCK), Result.WIN);
        allMove.put(new Move(Item.SCISSORS, Item.SCISSORS), Result.DRAW);
        allMove.put(new Move(Item.SCISSORS, Item.LIZARD), Result.LOST);
        allMove.put(new Move(Item.SCISSORS, Item.PAPER), Result.WIN);

        allMove.put(new Move(Item.PAPER, Item.ROCK), Result.WIN);
        allMove.put(new Move(Item.PAPER, Item.SPOCK), Result.WIN);
        allMove.put(new Move(Item.PAPER, Item.SCISSORS), Result.LOST);
        allMove.put(new Move(Item.PAPER, Item.LIZARD), Result.LOST);
        allMove.put(new Move(Item.PAPER, Item.PAPER), Result.DRAW);

        allMove.put(new Move(Item.SPOCK, Item.ROCK), Result.WIN);
        allMove.put(new Move(Item.SPOCK, Item.SPOCK), Result.DRAW);
        allMove.put(new Move(Item.SPOCK, Item.SCISSORS), Result.WIN);
        allMove.put(new Move(Item.SPOCK, Item.LIZARD), Result.LOST);
        allMove.put(new Move(Item.SPOCK, Item.PAPER), Result.LOST);

        allMove.put(new Move(Item.LIZARD, Item.ROCK), Result.LOST);
        allMove.put(new Move(Item.LIZARD, Item.SPOCK), Result.WIN);
        allMove.put(new Move(Item.LIZARD, Item.SCISSORS), Result.LOST);
        allMove.put(new Move(Item.LIZARD, Item.LIZARD), Result.DRAW);
        allMove.put(new Move(Item.LIZARD, Item.PAPER), Result.WIN);
    }

    public Result getResult(Move move){
        return this.allMove.get(move);
    }
}