// Optimal Solution to Solve the Largest ELement in the Array
public class LargestElementFinder2 {
    public static void main(String[] args) {
        
        int arr[] = {10, 45, 66, 11, 59, 102};
        System.out.println("The Largest Element in the Array is : "+ isLargest(arr));


    }

    public static int isLargest(int arr[]){
        int isLargest = arr[0];
        for(int i = 1;i<arr.length; i++){
            if(arr[i]>isLargest){
                isLargest = arr[i];
            }

        }

        return isLargest;
    }
}
