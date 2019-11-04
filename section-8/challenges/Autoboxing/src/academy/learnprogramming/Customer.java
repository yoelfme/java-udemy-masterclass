package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions.add(initialTransaction);
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
