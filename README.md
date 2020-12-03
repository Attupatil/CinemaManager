# CinemaManager
A Text application based made in JAVA that helps manage a cinema theatre: sell tickets, check available seats, see sales statistics, and more.

Menu looks like this:

```
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
```
When the item Statistics is chosen,program prints the following information:

    The number of purchased tickets;
    The number of purchased tickets represented as a percentage. Percentages rounded to 2 decimal places;
    Current income;
    
Total income that shows how much money the theatre will get if all the tickets are sold.
Buy a ticket doesn't allow a user to buy a ticket that has already been purchased.

If a user chooses an already taken seat,program prints That ticket has already been purchased and ask them to enter different seat coordinates until they pick an available seat. Of course, you shouldn't allow coordinates that are out of bounds. If this happens, it prints Wrong input! and ask to enter different seat coordinates until the user picks an available seat.

```bash
Enter the number of rows:
> 7
Enter the number of seats in each row:
> 7

1. Show the seats
2. Buy a ticket
0. Exit
> 1

Cinema:
  1 2 3 4 5 6 7
1 S S S S S S S
2 S S S S S S S
3 S S S S S S S
4 S S S S S S S
5 S S S S S S S
6 S S S S S S S
7 S S S S S S S

1. Show the seats
2. Buy a ticket
0. Exit
> 2

Enter a row number:
> 4
Enter a seat number in that row:
> 5
Ticket price: $10

1. Show the seats
2. Buy a ticket
0. Exit
> 1

Cinema:
  1 2 3 4 5 6 7
1 S S S S S S S
2 S S S S S S S
3 S S S S S S S
4 S S S S B S S
5 S S S S S S S
6 S S S S S S S
7 S S S S S S S

1. Show the seats
2. Buy a ticket
0. Exit
> 0
```
