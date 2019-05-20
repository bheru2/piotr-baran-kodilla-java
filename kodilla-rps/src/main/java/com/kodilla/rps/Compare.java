package com.kodilla.rps;

public class Compare {

    public static void compareItems(Player player, CPU cpu) {
        switch (player.getItem()) {
            case ROCK:
                if (cpu.getItem().equals(Item.LIZARD) || cpu.getItem().equals(Item.SCISSORS)) {
                    player.setScore(player.getScore() + 1);
                } else if (cpu.getItem().equals(Item.ROCK)) {
                    player.setScore(player.getScore() + 1);
                    cpu.setScore(cpu.getScore() + 1);
                } else {
                    cpu.setScore(cpu.getScore() + 1);
                }
                break;
            case PAPER:
                if (cpu.getItem().equals(Item.SPOCK) || cpu.getItem().equals(Item.ROCK)) {
                    player.setScore(player.getScore() + 1);
                } else if (cpu.getItem().equals(Item.PAPER)) {
                    player.setScore(player.getScore() + 1);
                    cpu.setScore(cpu.getScore() + 1);
                } else {
                    cpu.setScore(cpu.getScore() + 1);
                }
                break;
            case SCISSORS:
                if (cpu.getItem().equals(Item.PAPER) || cpu.getItem().equals(Item.SPOCK)) {
                    player.setScore(player.getScore() + 1);
                } else if (cpu.getItem().equals(Item.SCISSORS)) {
                    player.setScore(player.getScore() + 1);
                    cpu.setScore(cpu.getScore() + 1);
                } else {
                    cpu.setScore(cpu.getScore() + 1);
                }
                break;
            case SPOCK:
                if (cpu.getItem().equals(Item.SCISSORS) || cpu.getItem().equals(Item.ROCK)) {
                    player.setScore(player.getScore() + 1);
                } else if (cpu.getItem().equals(Item.SPOCK)) {
                    player.setScore(player.getScore() + 1);
                    cpu.setScore(cpu.getScore() + 1);
                } else {
                    cpu.setScore(cpu.getScore() + 1);
                }
                break;
            case LIZARD:
                if (cpu.getItem().equals(Item.SPOCK) || cpu.getItem().equals(Item.PAPER)) {
                    player.setScore(player.getScore() + 1);
                } else if (cpu.getItem().equals(Item.LIZARD)) {
                    player.setScore(player.getScore() + 1);
                    cpu.setScore(cpu.getScore() + 1);
                } else {
                    cpu.setScore(cpu.getScore() + 1);
                }
                break;
        }
    }
}
