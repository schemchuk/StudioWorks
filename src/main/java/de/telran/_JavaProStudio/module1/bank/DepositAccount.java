package de.telran._JavaProStudio.module1.bank;

public  class DepositAccount extends ClientAccount{
    private double maxDeposit;

    public DepositAccount(double maxDeposit, String accountOwner, String accountNumber) {
        this.maxDeposit = maxDeposit;
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.status = "Opened";
        this.openDate = "today";
    }

    public double getAccountOwner() {
        return maxDeposit;
    }

    public String getMaxdeposit() {
        return accountOwner;
    }

    public void setMaxDeposit(double maxDeposit) {
        this.maxDeposit = maxDeposit;
    }

    @Override
    public void withdraw(double sum) {
if (sum <= balance) {
    balance -= sum;
    System.out.println("Your balance has been changes");
} else  {
    System.out.println("you try withdraw more as you have");
}
    }

    @Override
    public void deposit(double sum) {
        if (sum <= balance) {
            balance -= sum;
            System.out.println("Your balance has been changes");
        } else  {
            System.out.println("you try deposit more as allowed");
        }
    }
}
