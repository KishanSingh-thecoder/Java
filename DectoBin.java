import java.util.Scanner;

public class DectoBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BinaryConversion(num);
    }
    public static void BinaryConversion(int n){
        int pow = 0;
        long bin = 0;
        while (n>0){
            int rem = n%2;
            bin = bin + rem * (long)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.print(bin);
    }
}
