import javax.naming.PartialResultException;
import java.util.Scanner;

public class ArrayPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elemets in an array");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arraypairs(arr);
    }
    public static void Arraypairs(int array[]){
        int tp =0;
        for (int i =0; i<array.length;i++){
            int curr = array[i];
            for (int j = i+1;j<array.length;j++){
                System.out.print("(" + curr + "," + array[j] +")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+tp);
    }
}
