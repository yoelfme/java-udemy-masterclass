package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            System.out.println("Branch " + name + " already exists!");

            return false;
        }

        return this.branches.add(new Branch(name));
    }

    public boolean addCustomerToBranch(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Adding customer " + customerName + " to branch " + branchName);
            return branch.addCustomer(customerName, initialTransaction);
        }

        System.out.println("We don't have a branch with the name " + branchName);

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.addTransactionToCustomer(customerName, initialTransaction);
        }

        System.out.println("We don't have a branch with the name " + branchName);
        return false;
    }

    public void showCustomerFromBranch(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            branch.printCustomers(showTransactions);
            return;
        }

        System.out.println("We don't have a branch with the name " + branchName);
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);

            if (branch.getName().equals(name)) {
                return this.branches.get(i);
            }
        }

        return null;
    }
}
