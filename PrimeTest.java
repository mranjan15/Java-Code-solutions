public class PrimeTest {

    public boolean isPrime(int number) {
        boolean isItPrime = false;
        int divider = 2;
        int checker = 0;

            while (divider < number) {
                if (number % divider == 0) {
                    checker = 1;
                }
                divider++;
            }
            if (checker == 0) {
                isItPrime = true;
            }
        return isItPrime;
    }

    public static void main(String... args) {
        PrimeTest primeTest = new PrimeTest();
        final int number = 25;
        if (primeTest.isPrime(number)) {
            System.out.println("Number: " + number + " is a prime number.");
        } else {
            System.out.println("Number: " + number + " is not a prime number.");
        }
    }
}
