import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int BC = BinCo(a,b);
        System.out.println(BC);
    }
    int fact = 1;
    public static int Fact (int n){
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int BinCo(int n, int r){
        int fact_n = Fact(n);
        int fact_r = Fact(r);
        int fact_nmr = Fact(n-r);

        return fact_n / (fact_r*fact_nmr);
    }
}
