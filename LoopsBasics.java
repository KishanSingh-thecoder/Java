import java.util.Scanner;

public class LoopsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 0;
//        while (i<=n){
//            System.out.println(i);
//            i++;
//        }
        int i = 1;
        int sum = 0;
        while (i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first natural number : " + sum);
    }
}
