import java.util.Scanner;

public class Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Subarrays(arr);
    }
    public static void Subarrays(int array[]){
        int ts = 0;
        for (int i = 0;i<array.length;i++){
            int start = i;
            for (int j = i;j<array.length;j++){
                int end = j;
                for (int k = start;k<=end;k++){
                    System.out.print(array[k]+ " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays "+ ts);
    }
}
