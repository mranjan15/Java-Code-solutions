package src.com.codeArena;

public class isPrime {
    int n;

    public isPrime(int n) {
        this.n = n;
    }

    public boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
