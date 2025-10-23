import java.util.*;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double int_rate = 0.03;
        double bal;
        int year = 0;
        int choice;


        System.out.print("Enter initial balance: ");
        bal = scanner.nextDouble();

        do {
            year ++;
             bal = bal + (bal * int_rate);

            System.out.printf("After " + year +  " year/s at 0.03 interest rate, balance is $%.2f", bal);
        
            System.out.println("");

            System.out.println("Do you want to see the balance at the end of the year? ");
            System.out.print("Enter 1 for yes or any number for no >> ");
            choice = scanner.nextInt();

        } while (choice == 1);

        scanner.close();
    }
}
