package com.pluralsight;

import java.util.Scanner;

public class TheaterReservationsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //added a scanner.

        //gets the user full name.
        System.out.println("Please enter your name:");
        String fullName = scanner.nextLine();

        //gets the date when the user want to watch the movie.
        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String date = scanner.nextLine();
        scanner.nextLine();

        //gets how many tickets does the user want.
        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();


    }
}
