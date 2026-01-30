import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (palindrome(n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
    public static boolean palindrome(int n) {
        int p = n;
        int rev = 0;
        while (p > 0) {
            int lastdigit = p % 10;
            rev = rev * 10 + lastdigit;
            p = p / 10;
        }
        if (n == rev) {
            return true;
        }
    return false;
    }

}
