// Effecient Solution to find the second element in the Array;

public class SecondLargestElementInArray2 {
    public static void main(String[] args) {
        
        int arr[] = {1,3,4,5,7,9,8};

        System.out.println("The Second Largest Element in the Array is: "+ SecondLargestEle(arr));
    }
    static int SecondLargestEle(int arr[]){
        int res = -1, largest = 0;

        for(int i = 1; i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i]<arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res == -1 ? -1 : arr[res];
    }
}
