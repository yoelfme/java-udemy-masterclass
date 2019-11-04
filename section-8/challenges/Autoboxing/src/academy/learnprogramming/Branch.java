package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public boolean addCustomer(String name, double initialTransaction) {
        if (existsCustomer(name)) {
            System.out.println("Customer with name " + name + " already exists!");
            return false;
        }

        System.out.println("Customer with name " + name + " has been added to " + this.name);

        return this.customers.add(new Customer(name, initialTransaction));
    }

    public boolean addTransactionToCustomer(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);

        if (customer != null) {
            customer.addTransaction(transaction);

            System.out.println("Transaction of " + transaction + " was added to the customer " + customerName + "in branch" + this.name);

            return true;
        }

        System.out.println("Customer " + customerName + " does not exists for branch " + this.name);

        return false;
    }

    public void printCustomers(boolean showTransactions) {
        System.out.println("Branch: " + this.name);

        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            System.out.println("\t" + (i + 1) + ". " + customer.getName());

            if (showTransactions) {
                ArrayList<Double> transactions = customer.getTransactions();

                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("\t\t[" + (j + 1) + "] Amount: " + transactions.get(j));
                }
            }
        }
    }

    private boolean existsCustomer(String name) {
        return findCustomer(name) != null;
    }

    private Customer getCustomer(int id) {
        return this.customers.get(id);
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);

            if (customer.getName().equals(name)) {
                return this.customers.get(i);
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }
}
