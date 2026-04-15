package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String fullName = scanner.nextLine();

        System.out.println("What date will you be attending (YYYY-MM-DD)?");
        String input = scanner.nextLine();
        LocalDate reservation = LocalDate.parse(input);

        System.out.println("How many tickets will you need");
        String tickets = scanner.nextLine();


        System.out.println(reservation);
        System.out.println(input);
    }
}
