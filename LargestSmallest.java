import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of element in an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the arrays");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        largestSmallest(arr);
    }
    public static void largestSmallest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length;i++){

            if (arr[i]>largest){
                largest = arr[i];

            }
            if (arr[i]<smallest){
                smallest = arr[i];

            }

        }
        System.out.println("Largest number is "+largest);
        System.out.println("Smallest number is "+smallest);
    }
}
