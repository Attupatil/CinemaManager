package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        char[][] cinemaHall = makeCinemaHall(rows, seats);

        printCinemaHall(cinemaHall);

        System.out.println("\nEnter a row number:");
        int row = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seat = scanner.nextInt();

        System.out.println("\nTicket price: $" + checkTicketPrice(cinemaHall, row));
        cinemaHall[row - 1][seat - 1] = 'B';
        printCinemaHall(cinemaHall);
    }

    static char[][] makeCinemaHall(int r, int s) {
        char[][] cinemaHall = new char[r][s];
        for (char[] chars : cinemaHall) {
            Arrays.fill(chars, 'S');
        }
        return cinemaHall;
    }

    static void printCinemaHall(char[][] seats) {
        System.out.println("\nCinema:");
        for (int i = 0; i < seats.length; i++) {
            if (i == 0) {
                System.out.print("  ");
                for (int k = 0; k < seats[i].length; k++) {
                    System.out.print(k + 1 + " ");
                }
                System.out.println();
            }
            System.out.print(i + 1 + " ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int allTicketsPrice(int r, int s) {
        int totalPrice;
        if (r * s <= 60) {
            totalPrice = r * s * 10;
        } else {
            if (r % 2 != 0) {
                totalPrice = r / 2 * s * 10 + (r / 2 + 1) * s * 8;
            } else {
                totalPrice = r / 2 * s * 10 + r / 2 * s * 8;
            }
        }
        return totalPrice;
    }

    static int checkTicketPrice(char[][] seats, int r) {
        int ticketPrice;
        if (seats.length * seats[r].length <= 60) {
            ticketPrice = 10;
        } else {
            if (r > seats.length / 2) {
                ticketPrice = 8;
            } else {
                ticketPrice = 10;
            }
        }
        return ticketPrice;
    }
}
