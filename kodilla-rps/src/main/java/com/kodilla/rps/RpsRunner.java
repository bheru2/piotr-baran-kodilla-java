package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game(new Input());
        game.init();
    }
}
