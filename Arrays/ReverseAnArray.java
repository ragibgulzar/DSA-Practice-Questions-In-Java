// Reverse an Array

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int low = 0, high = arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
