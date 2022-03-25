package com.matt.ticket;


import java.util.Scanner;

public class Buying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Your start station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
            int choice = Integer.parseInt(scanner.next());
            if(choice == 0){
                break;
            }
            Station begin = null;
            switch (choice){
                case 1:
                    begin = Station.TAIPEI_STATION;
                    break;
                case 2:
                    begin = Station.TAICHUNG_STATION;
                    break;
                case 3:
                    begin = Station.KAOHSIUNG_STATION;
                    break;
            }
            System.out.println("Your end station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
            int choice1 = Integer.parseInt(scanner.next());
            Station end = null;
            switch (choice1){
                case 1:
                    end = Station.TAIPEI_STATION;
                    break;
                case 2:
                    end = Station.TAICHUNG_STATION;
                    break;
                case 3:
                    end = Station.KAOHSIUNG_STATION;
                    break;
            }
            System.out.println("choose type(1: normal, 2: student, 3: old)");
            int type = Integer.parseInt(scanner.next());
            System.out.println("how many: ");
            int n = Integer.parseInt(scanner.next());
            switch (type){
                case 1:
                    Ticket ticket = new Ticket(begin, end, n);
                    ticket.print();
                    break;
                case 2:
                    StudentTicket studentTicket = new StudentTicket(begin, end, n);
                    studentTicket.print();
                    break;
                case 3:
                    GrandTicket grandTicket = new GrandTicket(begin, end, n);
                    grandTicket.print();
            }
        }
    }
}
