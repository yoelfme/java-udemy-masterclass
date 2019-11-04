package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Banco Industrial");

        bank.addBranch("Checking");

        bank.addCustomerToBranch("Checking", "Yoel Monzon", 200);
        bank.addCustomerToBranch("Checking", "Yoel Monzon", 400);
        bank.addCustomerToBranch("Checking", "Fransua Estrada", 200);
        bank.addCustomerTransaction("Checking", "Yoel Monzon", 300);

        bank.showCustomerFromBranch("Checking", true);

        bank.addBranch("Checking");
    }
}
