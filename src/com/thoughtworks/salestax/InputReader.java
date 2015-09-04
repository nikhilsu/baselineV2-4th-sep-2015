package com.thoughtworks.salestax;

import java.util.Scanner;

//InputReader takes in user input
public class InputReader {
    Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String read() {
        return scanner.nextLine();
    }
}
