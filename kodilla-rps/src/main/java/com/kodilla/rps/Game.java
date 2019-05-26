package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;

public class Game {
    private KeyboardInput keyboardInput;
    private boolean isEasyGame = false;
    private boolean isRunning = false;
    private boolean newGame = false;
    private HumanPlayer humanPlayer;
    private ComputerPlayer cpu;
    private MoveList moveList;

    public Game(KeyboardInput keyboardInput) {
        this.keyboardInput = keyboardInput;

        this.moveList = new MoveList();
    }

    public void run() {

            do {
                initGameMenu();
                while (!newGame) {
                    startGame();
                    endGame();
                }
            } while (!isRunning);
        }

    private void initGameMenu() {
        this.cpu = new ComputerPlayer();
        this.humanPlayer = new HumanPlayer();
        System.out.println("Welcome in RPS game!!");
        System.out.println("---------------------");
        System.out.println("Please enter your name");
        this.humanPlayer.setName(this.keyboardInput.key().toUpperCase());
        List<String> allowedInputs = Arrays.asList("1", "2", "q");
        String levelChoose;
        do {
            System.out.println("Please choose level  ");
            System.out.println("1. Easy Game");
            System.out.println("2. Hard Game");
            System.out.println("Q  Exit Application");
            levelChoose = this.keyboardInput.key();
            if (levelChoose.toUpperCase().equals("Q")) {
                isRunning = true;
            } else if (!levelChoose.equals("1")) {
                this.isEasyGame = true;
            }
        } while (!allowedInputs.contains(levelChoose));
    }

    private void startGame() {
        List<Integer> allowedInputs = Arrays.asList(1, 2, 3, 4, 5);
        int rounds = 0;
        do {
            System.out.println("How many rounds you want play(1 -5)");
            try {
                rounds = Integer.parseInt(this.keyboardInput.key());
            } catch (Exception e) {
                System.out.println("You have chosen the wrong option. Please try again");
            }
        } while (!allowedInputs.contains(rounds));
        while (!isRunning||!newGame) {
            System.out.println("wybierz item");
            System.out.println("1." + Item.PAPER);
            System.out.println("2." + Item.ROCK);
            System.out.println("3." + Item.SCISSORS);
            if (this.isEasyGame) {
                System.out.println("4." + Item.SPOCK);
                System.out.println("5." + Item.LIZARD);
            }
            System.out.println("Q - Exit Application");
            System.out.println("R - restart game");
            String moveChosen = (this.keyboardInput.key().toUpperCase());
            switch (moveChosen) {
                case "1":
                    fight(Item.PAPER);
                    break;
                case "2":
                    fight(Item.ROCK);
                    break;
                case "3":
                    fight(Item.SCISSORS);
                    break;
                case "4":
                    fight(Item.SPOCK);
                    break;
                case "5":
                    fight(Item.LIZARD);
                    break;
                case "Q":
                    System.out.println("Closing application");
                    isRunning = true;
                    break;
                default:
                    System.out.println("You have chosen the wrong option. Please try again");
                    rounds++;
            }
            if (isRunning) {
                break;
            }
            rounds--;
            if (rounds == 0) {
                endGame();
            }
        }
    }

    private void endGame() {
        if (humanPlayer.getScore() > cpu.getScore()) {
            System.out.println("Wygrales");
        } else if (humanPlayer.getScore() == cpu.getScore()) {
            System.out.println("Remis");
        } else {
            System.out.println("Przegrales");
        }
        List<String> allowedInputs = Arrays.asList("N", "Y");
        String playAgain;
        do {
            System.out.println("Do you want paly again?");
            playAgain = this.keyboardInput.key().toUpperCase();
        } while (!allowedInputs.contains(playAgain));
        if (playAgain.equals("Y")) {
            this.newGame = true;
        }
    }

    private void fight(Item item) {
        System.out.println(humanPlayer.getName() + " choose " + item);
        humanPlayer.setItem(item);
        Result result = moveList.getResult((new Move(humanPlayer.getItem(), cpu.itemGenerator(isEasyGame))));
        System.out.println("Computer choose " + cpu.getItem());
        if (result == Result.WIN) {
            humanPlayer.setScore();
            System.out.println("You win");
            results();
        } else if (result == Result.DRAW) {
            humanPlayer.setScore();
            cpu.setScore();
            System.out.println("Draw");
            results();
        } else {
            cpu.setScore();
            System.out.println("You lost");
            results();
        }
    }

    private void results() {
        System.out.println(this.humanPlayer.getName() + " " + this.humanPlayer.getScore() + " points");
        System.out.println("Computer " + this.cpu.getScore() + " points");
    }
}
