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
        initGame();
        while (!isRunning) {
            newGame = false;
            while (!newGame) {
                initGameMenu();
                startGame();
                endGame();
            }
        }
    }

    private void initGame() {
        this.cpu = new ComputerPlayer();
        this.humanPlayer = new HumanPlayer();
        System.out.println("Welcome in RPS game!!");
        System.out.println("---------------------");
        System.out.println("Please enter your name");
        this.humanPlayer.setName(this.keyboardInput.key().toUpperCase());
    }

    private void initGameMenu() {
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
                newGame = true;
            } else if (!levelChoose.equals("1")) {
                this.isEasyGame = true;
            }
        } while (!allowedInputs.contains(levelChoose));
    }

    private void startGame() {
        if (isRunning) {
            return;
        }
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
        while (!newGame) {
            System.out.println("wybierz item");
            System.out.println("1." + ChooseMove.PAPER);
            System.out.println("2." + ChooseMove.ROCK);
            System.out.println("3." + ChooseMove.SCISSORS);
            if (this.isEasyGame) {
                System.out.println("4." + ChooseMove.SPOCK);
                System.out.println("5." + ChooseMove.LIZARD);
            }
            System.out.println("Q - Exit Application");
            String moveChosen = (this.keyboardInput.key().toUpperCase());
            switch (moveChosen) {
                case "1":
                    fight(ChooseMove.PAPER);
                    break;
                case "2":
                    fight(ChooseMove.ROCK);
                    break;
                case "3":
                    fight(ChooseMove.SCISSORS);
                    break;
                case "4":
                    fight(ChooseMove.SPOCK);
                    break;
                case "5":
                    fight(ChooseMove.LIZARD);
                    break;
                case "Q":
                    System.out.println("Closing application");
                    newGame = true;
                    isRunning = true;
                    break;
                default:
                    System.out.println("You have chosen the wrong option. Please try again");
                    rounds++;
            }
            if (isRunning || isEasyGame) {
                break;
            }
            rounds--;
            if (rounds == 0) {
                endGame();
            }
        }
    }

    private void endGame() {
        if (newGame) {
            return;
        }
        if (humanPlayer.getScore() > cpu.getScore()) {
            System.out.println("You WIN!");
        } else if (humanPlayer.getScore() == cpu.getScore()) {
            System.out.println("DRAW");
        } else {
            System.out.println("You LOST");
        }
        List<String> allowedInputs = Arrays.asList("N", "Y");
        String playAgain;
        do {
            System.out.println("Do you want play again?(Y/N)");
            playAgain = this.keyboardInput.key().toUpperCase();
        } while (!allowedInputs.contains(playAgain));
        if (playAgain.equals("N")) {
            this.isRunning = true;
            this.newGame = true;
        } else {
            this.newGame = true;
        }
    }

    private void fight(ChooseMove chooseMove) {
        System.out.println(humanPlayer.getName() + " choose " + chooseMove);
        humanPlayer.setChooseMove(chooseMove);
        Result result = moveList.getResult((new Move(humanPlayer.getChooseMove(), cpu.itemGenerator(isEasyGame))));
        System.out.println("Computer choose " + cpu.getChooseMove());
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
