public class Account {
    private int balance;
    
    public Account(int balanceAmount) {
        balance = balanceAmount;
    }
    
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds, withdrawal not processed.");
        } else {
            this.balance -= amount;
            System.out.println("Successful withdrawal of $" + amount);
        }
    }

    public double getBalance() {
        return 0;
    }
}