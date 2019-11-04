package academy.learnprogramming;

public class LargestPrime {
    public static int getLargestPrime(int x){
        if(x <= 1) return -1;
        for(int i = x-1; i >= 2; i--){
            if (x % i == 0) return getLargestPrime(i);
        }
        return x;
    }
}
