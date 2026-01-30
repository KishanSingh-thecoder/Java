import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        System.out.println("Enter a sorted array");
        int[] arr = new int[n];
        for (int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be search");
        int key = sc.nextInt();
        int index = BinarySearch(arr,key);
        if (index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at index "+ index);
        }
    }
    public static int BinarySearch(int[] array, int keys){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (array[mid] == keys){
                return mid;
            }
            if (array[mid] > keys){
               end = mid-1;
            }
            if (array[mid] < keys){
                start = mid+1;
            }
        }
        return -1;
    }
}
