package cinema;

import java.util.Scanner;

public class Cinema {
  static String[][] cinema;
  static int rows = 0;
  static int seats = 0;
  static Scanner sc = new Scanner(System. in );

  public static void main(String[] args) {
    String input;
    System.out.println("Enter the number of rows:");
    input = sc.nextLine();
    rows = Integer.parseInt(input);
    System.out.println("Enter the number of seats in each row:");
    input = sc.nextLine();
    seats = Integer.parseInt(input);
    
    cinemaSize();
    printMenu();
    // cinemaPattern();
    // ticketPrice();
  }
   private static void printMenu() {
        while (true) {
            System.out.println("\n1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");

            switch (sc.nextLine()) {
                case "1":
                    cinemaPattern();
                    break;
                case "2":
                    ticketPrice();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Try again.");
                    break;
            }
        }
    }

  public static void cinemaSize() {
    cinema = new String[rows][seats];
    for (int y = 0; y < cinema.length; y++) {
      for (int x = 0; x < cinema[y].length; x++) {
        cinema[y][x] = "S";
      }
    }
  }

  public static void cinemaPattern() {
    System.out.println();
    System.out.println("Cinema:");
    System.out.print(" ");
    for (int i = 1; i <= seats; i++) {
      System.out.print(" " + i);
    }
    System.out.println();
    for (int y = 0; y < cinema.length; y++) {
      System.out.print(y + 1);
      for (int x = 0; x < cinema[y].length; x++) {
        System.out.print(" " + cinema[y][x]);
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void ticketPrice() {
    String input = "";
    System.out.println("Enter a row number:");
    input = sc.nextLine();
    int rowsBuy = Integer.parseInt(input);
    System.out.println("Enter a seat number in that row:");
    input = sc.nextLine();
    int seatsBuy = Integer.parseInt(input);
    if (seats * rows <= 60) {
      System.out.println("Ticket price: $10");
    } else {
      System.out.println("Ticket price: $" + (rowsBuy <= rows / 2 ? "10": "8"));
    }
    cinema[rowsBuy - 1][seatsBuy - 1] = "B";
    cinemaPattern();
  }

  public static void totalIncome() {
    if (seats * rows <= 60) {
      System.out.println("Total income:\n" + "$" + seats * rows * 10);
    } else {
      System.out.println("Total income:\n" + "$" + (rows % 2 == 0 ? seats * rows * 9 : seats * (rows / 2) * 10 + seats * (1 + rows / 2) * 8));
    }
  }
}
