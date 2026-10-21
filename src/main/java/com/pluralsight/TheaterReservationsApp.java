package com.pluralsight;

import java.util.Scanner;

public class TheaterReservationsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //added a scanner.

        //gets the user full name.
        System.out.print("Please enter your name:");
        String fullName = scanner.nextLine();
        String[] namePart = fullName.split(" "); // split the fullName

        String firstName = namePart[0];
        String lastName = namePart[1];

                //gets the date when the user want to watch the movie.
        System.out.print("What date will you be coming (MM/dd/yyyy):");
        String date = scanner.nextLine();

        //gets how many tickets does the user want.
        System.out.print("How many tickets would you like?");
        int tickets = scanner.nextInt();

        //System.out.print(tickets + " reserved for " + date + " under " + lastName + firstName);

    }
}
