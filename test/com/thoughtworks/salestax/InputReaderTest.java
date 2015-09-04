package com.thoughtworks.salestax;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class InputReaderTest {

    @Test
    public void shouldReturnTheInputGivenByTheUser() {
        final ByteArrayInputStream input = new ByteArrayInputStream("1 book at 10.0".getBytes());
        System.setIn(input);
        Scanner scanner = new Scanner(System.in);
        InputReader inputReader = new InputReader(scanner);

        assertEquals("1 book at 10.0", inputReader.read());

        System.setIn(System.in);
    }

}