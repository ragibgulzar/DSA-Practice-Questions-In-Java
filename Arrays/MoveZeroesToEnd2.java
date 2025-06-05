// Efficient Solution to Move Zeroes to End

public class MoveZeroesToEnd2 {
    public static void main(String[] args) {
       int arr[] = {1,2,0,4,0,5,0};
       int n = arr.length;


       int count = 0;
       for(int i = 0; i < n; i++){
            if(arr[i]!=0){
               int temp = arr[i];
               arr[i] = arr[count];
               arr[count] = temp;
                count++;
            }
           
       }

       for(int num: arr){
        System.out.print(num);
       }

    }
}
