package com.kodilla.rps;

import java.util.Objects;

public class Move {
    private ChooseMove computerPlayer;
    private ChooseMove humanPlayer;

    public Move(ChooseMove computerPlayer, ChooseMove humanPlayer) {
        this.computerPlayer = computerPlayer;
        this.humanPlayer = humanPlayer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return computerPlayer == move.computerPlayer &&
                humanPlayer == move.humanPlayer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerPlayer, humanPlayer);
    }
}
