package com.kodilla.rps;

import java.util.Scanner;

public class KeyboardInput {
    private Scanner scanner = new Scanner(System.in);

    public String key(){
        return this.scanner.nextLine();
    }
}
