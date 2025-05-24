
// Naive Approach to Solve Largest Element in the Array

public class LargestElementFinder{

        public static void main(String[] args) {
            
            int arr[] = {10,34,56,11,78,344};
            int a = findLargestElement(arr);
            System.out.println("Largest Element in the Array is: " + a);
        }

       

        public static int findLargestElement(int[] arr){ 
           // int largest = 0;
            for(int i = 0; i<arr.length; i++){
                boolean isLargest = true;
                for(int j=0; j<arr.length;j++){
                    
                    if(arr[j]>arr[i]){
                        isLargest = false;
                        break;
                    }
                }
               if(isLargest) return arr[i]; 
            }

            return -1;
        }

        
}