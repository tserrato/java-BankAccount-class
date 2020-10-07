
// Import Scanner Class
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class BankDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Beginning Balance: ");

        BankAccount Tyler  = new BankAccount(scan.nextDouble());
        while(1==1){
            System.out.println("Would you like to 1) Deposit 2) Withdraw 3) Calculate Interest 4) Quit ");

            int action = scan.nextInt();

            if(action == 1){
                System.out.println("How much would you like to deposit: ");
                double entry = scan.nextDouble();

                Tyler.deposit(entry);

                System.out.println("Your new balance is now: " + Tyler.getBalance());

            }

            else if(action == 2){
                System.out.println("How much would you like to withdraw: ");
                double entry = scan.nextDouble();

                Tyler.withdraw(entry);

                System.out.println("Your new balance is now: " + Tyler.getBalance());

            }

            else if(action == 3){
                System.out.println("What is the interest rate(in %): ");
                double entry = scan.nextDouble();

                Tyler.calcInterest(entry);

                System.out.println("Your new balance is now: " + Tyler.getBalance());

            }
            else{
                break;
        }
    }

    }
}
