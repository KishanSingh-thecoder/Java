import java.util.Scanner;

public class TaxCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income ");
        int income = sc.nextInt();
        if (income<500000){
            System.out.println("No Tax");
        } else if (income > 500000 && income < 1500000) {
            System.out.println("Tax is : " + (.15*income) );
        }else {
            System.out.println("Tax is : " + (.3*income));
        }
    }
}
