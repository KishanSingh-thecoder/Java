import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements needed in array");
        int n = sc.nextInt();
        System.out.println("Enter the arrays");
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int index = LinearSearch(numbers,key);
        if (index == -1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number found at index "+index);
        }
    }
    public static int LinearSearch(int[] num, int key){
        for (int i = 0; i<num.length;i++){
            if (num[i] == key){
                return i;
            }
        }
        return -1;
    }
}
