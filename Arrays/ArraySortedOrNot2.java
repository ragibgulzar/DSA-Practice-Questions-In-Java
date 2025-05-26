
import java.util.Scanner;

// Effecient Solution for checking is the Array is sorted or not


public class ArraySortedOrNot2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){ 
            arr[i] = input.nextInt();
        }

        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int arr[]){  

        for(int i = 0; i<arr.length -1; i++) { 
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;

    }
}
