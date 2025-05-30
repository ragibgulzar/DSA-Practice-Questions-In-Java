public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6};
        
        int n = arr.length;

        int j = 1;
        for(int i = 1; i<n;i++){
            if(arr[j-1]!=arr[i]){
                arr[j]=arr[i];
                j++;
            }
        }

        for(int i = 0; i<j;i++){
            System.out.print(arr[i]);
        }
    }
}
