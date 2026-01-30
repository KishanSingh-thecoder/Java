import java.util.Scanner;

public class JavaBasics {
//    In a program, input 3 numbers : A, B and C. You have to output the average of
//    these 3 numbers.
    public static void main (String [] args){
//        System.out.print("Kishan Singh");
//        Scanner scn = new Scanner(System.in);
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//        int c = scn.nextInt();
//        float avg = (float) (a+b+c)/3;
//        System.out.print(avg);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }
//        int i = 1;
//        float sum = 0;
//        while (i<=n) {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

    }
}
