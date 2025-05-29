
// Naive Solution to Find the Second Largest Element in an Array ( For Educational Puposes only )

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,7,9,8};
        int Largest = LargestEle(arr);
        System.out.println("The Second Largest Element in the Array is: "+ SecondLargestEle(arr, Largest));
        
    }

    static int SecondLargestEle(int[] arr, int Largest){
        int res = -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] != Largest){
                if(res==-1){
                    res = arr[i];
                }
                else if(arr[i]>res){
                    res = arr[i];
                }
            }
        }


        return res;
    }

    static int  LargestEle(int[] arr){
        int Largest = arr[0];

        for(int i =1; i<arr.length;i++){
            if(arr[i]>Largest){
                Largest = arr[i];
            }
        }


        return  Largest;
    }
}
