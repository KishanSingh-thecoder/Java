import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = sc.nextInt();
        String Grade = (marks >= 33)? "Pass":"Fail";
        System.out.println(Grade);
    }
}
