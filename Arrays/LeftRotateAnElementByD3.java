// More Effecient Solution 

public class LeftRotateAnElementByD3 {
    
    public static void main(String[] args) {
        int arr[] = {1, 2 , 3, 4, 5};
        int n = arr.length;

        int d = 2;
        d = d%n;


        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);

        for(int num: arr){
            System.out.print(num+" ");
        }

    }

    static void reverseArray(int arr[], int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        
    }
   
}
