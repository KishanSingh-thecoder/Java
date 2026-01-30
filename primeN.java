import java.util.Scanner;

public class primeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrimeNumber(n);
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void PrimeNumber(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }

        }
        System.out.println();


    }
}



