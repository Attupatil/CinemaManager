package cinema;
import java.util.Scanner;
public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String [] field = {
        //     "Cinema:",
        //         "  1 2 3 4 5 6 7 8",
        //         "1 S S S S S S S S",
        //         "2 S S S S S S S S",
        //         "3 S S S S S S S S",
        //         "4 S S S S S S S S",
        //         "5 S S S S S S S S",
        //         "6 S S S S S S S S",
        //         "7 S S S S S S S S",
        // };
        // for (String s: field) {
        //     System.out.println(s);
        // }
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int c = sc.nextInt();
        int pr = 0;
        if(r*c <= 60){
            pr = r*c*10;
        }else{
            int fh = r / 2;
            int bh = r - fh;
            pr = fh*c*10+bh*c*8;
            
        }
        System.out.println("Total income:");
        System.out.print("$");
         System.out.print(pr);
        
        
        
        
    }
}
