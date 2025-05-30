//  Naive Approach to Remove Duplicates from Sorted Array


public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6};
        
        int n = arr.length;
        int temp[] = new int[n];
        temp[0]=arr[0];
        int j = 1;

        for(int i = 1; i < n; i++){
            if(temp[j-1]!=arr[i]){
                temp[j++]=arr[i];
            }

        }

        for(int i = 0; i<j;i++){
            arr[i] = temp[i];
            System.out.print(arr[i]);
        }

    }
}
