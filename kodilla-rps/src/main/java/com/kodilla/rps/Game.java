package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;

public class Game {
    private KeyboardInput keyboardInput;
    boolean isEasyGame = false;
    String levelChoose;
//    private List<String> allowedInputs = Arrays.asList("1","2","3","4", "5","r" ,"q");
    boolean isRunning =false;
    HumanPlayer humanPlayer;
    ComputerPlayer cpu;
    public Game(KeyboardInput keyboardInput) {
        this.keyboardInput = keyboardInput;
    }

    public void initGame() throws InterruptedException {
        System.out.println("Welcome in RPS game!!");
        System.out.println("---------------------");
        System.out.println("Please enter your name");
        humanPlayer = new HumanPlayer(this.keyboardInput.key());
        List<String> allowedInputs = Arrays.asList("1","2" ,"q");
        do{
        System.out.println("Please choose level  ");
        System.out.println("1. Easy Game");
        System.out.println("2. Hard Game");
        System.out.println("q  Exit Application");
        this.levelChoose = this.keyboardInput.key();
        if (this.levelChoose.toLowerCase().equals("q")){
            isRunning= true;
        } else if(!this.levelChoose.equals("1")){
            isEasyGame = true;
        }
        }while (!allowedInputs.contains(levelChoose));

        start();
    }

    public void start() throws InterruptedException {

        System.out.println("ile rund");
        int rounds = Integer.parseInt(this.keyboardInput.key());
        while (!isRunning) {
            System.out.println("wybierz item");
            System.out.println("1." + Item.PAPER);
            System.out.println("2." + Item.ROCK);
            System.out.println("3." + Item.SCISSORS);
            if (this.isEasyGame) {
                System.out.println("4." + Item.SPOCK);
                System.out.println("5." + Item.LIZARD);
            }
            System.out.println("x  Exit Application");
            String chooseItem = (this.keyboardInput.key());
            switch (chooseItem) {
                case "1":
                    System.out.println(humanPlayer.getName() + " wybral " + Item.PAPER);
                    humanPlayer.setItem(Item.PAPER);
                    System.out.println("CPU wybral " + cpu.itemGenerator());
                    Compare.compareItems(humanPlayer, cpu);
                    Thread.sleep(1000);
                    break;
                case "2":
                    System.out.println(humanPlayer.getName() + " wybral " + Item.ROCK);
                    humanPlayer.setItem(Item.ROCK);
                    System.out.println("CPU wybral " + cpu.itemGenerator());
                    Compare.compareItems(humanPlayer, cpu);
                    Thread.sleep(1000);
                    break;
                case "3":
                    System.out.println(humanPlayer.getName() + " wybral " + Item.SCISSORS);
                    humanPlayer.setItem(Item.SCISSORS);
                    System.out.println("CPU wybral " + cpu.itemGenerator());
                    Compare.compareItems(humanPlayer, cpu);
                    Thread.sleep(1000);
                    break;
                case "4":
                    System.out.println(humanPlayer.getName() + " wybral " + Item.SPOCK);
                    humanPlayer.setItem(Item.SPOCK);
                    System.out.println("CPU wybral " + cpu.itemGenerator());
                    Compare.compareItems(humanPlayer, cpu);
                    Thread.sleep(1000);
                    break;
                case "5":
                    System.out.println(humanPlayer.getName() + " wybral " + Item.LIZARD);
                    humanPlayer.setItem(Item.LIZARD);
                    System.out.println("CPU wybral " + cpu.itemGenerator());
                    Compare.compareItems(humanPlayer, cpu);
                    Thread.sleep(1000);
                    break;
                case "x":
                    System.out.println("Closing application");
                    isRunning = true;
                    break;
                default:
                    System.out.println(humanPlayer.getName() + " wybrales zla opcje komputer dostaje punkt");
                    cpu.setScore(cpu.getScore() + 1);
            }
            if (isRunning) {
                break;
            }
            System.out.println(humanPlayer.getName() + " : " + humanPlayer.getScore() + " points");
            System.out.println("Computer" + " : " + cpu.getScore() + " points");
            Thread.sleep(1000);
            System.out.println();
            rounds--;
            if (rounds == 0) {
                isRunning = true;
                if (humanPlayer.getScore() > cpu.getScore()) {
                    System.out.println("Wygrales");
                } else if (humanPlayer.getScore() == cpu.getScore()) {
                    System.out.println("Remis");
                } else {
                    System.out.println("Przegrales");
                }
                System.out.println("Koniec gry");
            }
        }
    }
}
