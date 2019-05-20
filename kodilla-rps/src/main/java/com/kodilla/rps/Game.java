package com.kodilla.rps;

public class Game {
    private Input input;

    public Game(Input input) {
        this.input = input;
    }

    public void init() throws InterruptedException {
        System.out.println("Welcome in RPS game!!");
        System.out.println("---------------------");
        System.out.println("Please choose level  ");
        System.out.println("1. Hard");
        System.out.println("2. Easy");
        System.out.println("x  Exit Application");
        String levelChoose = this.input.key();
        switch (levelChoose) {
            case "1":
                start();
                break;
            case "2":
                System.out.println();
                break;
            case "x":
                break;
            default:
                System.out.println("You pressed wrong button");
                Thread.sleep(1000);
                init();
        }
    }

    public void start() throws InterruptedException {
        System.out.println("Please enter your name");
        String playerName = this.input.key();
        Player player = new Player(playerName);
        CPU cpu = new CPU();
        boolean isRunning = false;
        System.out.println("ile rund");
        int rounds = Integer.parseInt(this.input.key());
        while (!isRunning) {
            System.out.println("wybierz item");
            System.out.println("1." + Item.PAPER);
            System.out.println("2." + Item.ROCK);
            System.out.println("3." + Item.SCISSORS);
            System.out.println("4." + Item.SPOCK);
            System.out.println("5." + Item.LIZARD);
            System.out.println("x  Exit Application");
            String chooseItem = (this.input.key());
            switch (chooseItem) {
                case "1":
                    System.out.println(player.getName() + " wybral " + Item.PAPER);
                    player.setItem(Item.PAPER);
                    cpu.itemGenerator();
                    System.out.println("CPU wybral " + cpu.getItem());
                    Compare.compareItems(player, cpu);
                    Thread.sleep(1000);
                    break;
                case "2":
                    System.out.println(player.getName() + " wybral " + Item.ROCK);
                    player.setItem(Item.ROCK);
                    cpu.itemGenerator();
                    System.out.println("CPU wybral " + cpu.getItem());
                    Compare.compareItems(player, cpu);
                    Thread.sleep(1000);
                    break;
                case "3":
                    System.out.println(player.getName() + " wybral " + Item.SCISSORS);
                    player.setItem(Item.SCISSORS);
                    cpu.itemGenerator();
                    System.out.println("CPU wybral " + cpu.getItem());
                    Compare.compareItems(player, cpu);
                    Thread.sleep(1000);
                    break;
                case "4":
                    System.out.println(player.getName() + " wybral " + Item.SPOCK);
                    player.setItem(Item.SPOCK);
                    cpu.itemGenerator();
                    System.out.println("CPU wybral " + cpu.getItem());
                    Compare.compareItems(player, cpu);
                    Thread.sleep(1000);
                    break;
                case "5":
                    System.out.println(player.getName() + " wybral " + Item.LIZARD);
                    player.setItem(Item.LIZARD);
                    cpu.itemGenerator();
                    System.out.println("CPU wybral " + cpu.getItem());
                    Compare.compareItems(player, cpu);
                    Thread.sleep(1000);
                    break;
                case "x":
                    System.out.println("Closing application");
                    isRunning = true;
                    break;
                default:
                    System.out.println(player.getName() + " wybrales zla opcje komputer dostaje punkt");
                    cpu.setScore(cpu.getScore() + 1);
            }
            if (isRunning) {
                break;
            }
            System.out.println(player.getName() + " : " + player.getScore() + " points");
            System.out.println("Computer" + " : " + cpu.getScore() + " points");
            Thread.sleep(1000);
            System.out.println();
            rounds--;
            if (rounds == 0) {
                isRunning = true;
                if (player.getScore() > cpu.getScore()) {
                    System.out.println("Wygrales");
                } else if (player.getScore() == cpu.getScore()) {
                    System.out.println("Remis");
                } else {
                    System.out.println("Przegrales");
                }
                System.out.println("Koniec gry");
            }
        }
    }
}
