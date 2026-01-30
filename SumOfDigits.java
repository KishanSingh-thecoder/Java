import java.util.Scanner;

public class SumOfDigits {
//    Write a program to find the sum of digits of a number using loops.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        if (number == 0){
            count = 1;
        }else {
            while (number != 0) {
                count = count + 1;
                number /= 10;
            }
        }
        System.out.println(count);
        int sum = 0;
        for (int i=0; i<=count;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
