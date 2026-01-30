import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in an array");
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Reversearray(arr);
    }
    public static void Reversearray(int[] array){
        int start = 0;
        int end = array.length-1;
        while (start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        for (int i =0; i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
