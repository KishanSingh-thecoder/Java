import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] marks = new int[20];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println(marks[0]+marks[1]+marks[3]);
    }
}
