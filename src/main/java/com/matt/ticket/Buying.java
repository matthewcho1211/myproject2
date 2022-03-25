package com.matt.ticket;


import java.util.Scanner;

public class Buying {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Ticket.TAIPEI_STATION, Ticket.TAICHUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station");
        int startStation = Integer.parseInt(scanner.next());
        System.out.println("Your end station");
        int endStation = Integer.parseInt(scanner.next());

    }
}
