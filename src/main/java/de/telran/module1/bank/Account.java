package de.telran.october15.bank.bank;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
   protected String status;
   protected String openDate;
    protected String closeData;

    public abstract void withdraw(double sum);
    public abstract  void deposit(double sum);

    public void setStatus(String status) {
        this.status = status;
    }

    public void closeAccount (String closeDate) {
        if (balance != 0) {
            this.status = "closed";
            this.closeData = closeDate;
            System.out.println("Your Account is closed");
        } else {
            System.out.println("You cant close your account");
        }
    }
}
