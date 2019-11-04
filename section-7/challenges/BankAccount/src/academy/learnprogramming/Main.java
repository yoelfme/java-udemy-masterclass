package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Account yoelAccount = new Account("12345678", 200.0, "Yoel", "yoel@gmail.com", "55149009");

        yoelAccount.withdraw(100);
        yoelAccount.deposit(50);
        yoelAccount.withdraw(100);
        yoelAccount.deposit(51);
        yoelAccount.withdraw(100);
    }
}
