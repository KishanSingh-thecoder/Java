import java.util.Scanner;

public class EvenOdd {
//    Write a program that reads a set of integers, and then prints the sum of the
//    even and odd integers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Integers : ");
        int number = sc.nextInt();
        int sumEven = 0; int sumOdd = 0;

        for (int i=0;i<number;i++){

            System.out.println("Enter the Integers : ");
            int integers = sc.nextInt();
            if (integers % 2 == 0){
                sumEven = sumEven + integers;
            }else{
                sumOdd = sumOdd + integers;
            }

        }
        System.out.println("Sum of Even Integers is "+sumEven);
        System.out.println("Sum of Odd Integers is "+sumOdd);

}
}
