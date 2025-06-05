// Naive Solution to Move Zeroes to End

public class MoveZeroesToEnd {
    public static void main(String[] args) {

        int arr[] = {1,2,0,4,0,5,0};
        int n = arr.length;

        for(int i = 0; i< n ; i++){
            if(arr[i]==0){
                for(int j = i+1;j <n; j++){
                    if(arr[j]!=0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        for(int num: arr){
            System.out.print(num);
        }
    }
}
