import java.util.Scanner;

public class BintoDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Decimalcoversion(num);
    }
    public static void Decimalcoversion(int n ){
        int pow = 0;
        int decimal = 0;
        while (n>0) {
            int lastDigit = n % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.print(decimal + " ");
    }
}
