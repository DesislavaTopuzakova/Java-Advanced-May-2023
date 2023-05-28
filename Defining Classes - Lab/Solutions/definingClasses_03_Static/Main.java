package definingClasses_03_Static;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);

       Map<Integer, BankAccount> bankAccounts = new HashMap<>();
        while (true) {
            String[] line = scanner.nextLine().split(" ");
            if ("end".equalsIgnoreCase(line[0])) {
                break;
            }

            switch (line[0]) {
                case "Create":
                    createBankAccount(bankAccounts);
                    break;
                case "Deposit":
                    depositSum(Integer.parseInt(line[1]), Double.parseDouble(line[2]), bankAccounts);
                    break;
                case "SetInterest":
                    setInterest(Double.parseDouble(line[1]));
                    break;
                case "GetInterest":
                    getInterest(Integer.parseInt(line[1]), Integer.parseInt(line[2]), bankAccounts);
                    break;
            }
        }
    }

    private static void getInterest(int id, int years, Map<Integer, BankAccount> bankAccounts) {
        if (bankAccounts.containsKey(id)) {
            System.out.printf("%.2f%n", bankAccounts.get(id).getInterestRate(years));
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void depositSum(int id, double amount, Map<Integer, BankAccount> bankAccounts) {
        if (bankAccounts.containsKey(id)) {
            bankAccounts.get(id).deposit(amount);
            System.out.printf("Deposited %.0f to ID%d%n", amount, id);
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void createBankAccount(Map<Integer, BankAccount> bankAccounts) {
        BankAccount ba = new BankAccount();
        bankAccounts.put(ba.getId(), ba);
        System.out.println("Account ID" + ba.getId() + " created");
    }

    private static void setInterest(double interest) {
        BankAccount.setInterestRate(interest);
    }
}
