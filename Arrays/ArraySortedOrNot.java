// Naive Solution to Check if Array is Sorted or Not

public class ArraySortedOrNot {
    public static void main(String[] args) {
         int arr[] = {13, 17, 70, 99, 102}; // sorted array example
        // int arr[] = {13, 17, 70, 60, 102}; // Unsorted example
        boolean result = isSortedOrNot(arr);
        if(result){
            System.out.println("The Array is Sorted");
        }
        else{
            System.out.println("The Array is not Sorted.");
        }
        
    }

    public static boolean isSortedOrNot(int arr[]){

        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }

        return true;
    }
}
