package definingClasses_03_Static;

class BankAccount {
    private static double interestRate = 0.02;
    private static int counter = 1;

    private int id;
    private double balance;

    BankAccount() {
        this.id = counter++;
    }

    int getId() {
        return this.id;
    }

    static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    double getInterestRate(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f", this.id, this.balance);
    }
}
