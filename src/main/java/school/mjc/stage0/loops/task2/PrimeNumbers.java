package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void printPrimeNumbers(int printToInclusive) {
        int start = 1;
        int end = 10;

        while (start <= end) {
            if (isPrime(start)) {
                System.out.println(start);
            }
            start++;
        }
    }
}
