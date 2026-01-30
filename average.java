import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b,c);
    }
    public static int average (int x, int y, int z){
        int avg = (x+y+z)/3;
        System.out.println(avg);
        return avg;
    }
}
