import java.util.Scanner;

public class Main
{
    private Account account;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please confirm the balance: ");
        int amount = scan.nextInt();
        Account account = new Account(amount);
        
        System.out.print("Enter the amount to withdraw: ");
        int withdrawAmount = scan.nextInt();
        // scan.close();
        account.withdraw(withdrawAmount);
    }
}
