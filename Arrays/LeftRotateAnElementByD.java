// This is a naive solution to left rotating an array by D positions -------> O(n*d) 

import java.util.Scanner;

public class LeftRotateAnElementByD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input Size of an array
        System.out.println("Enter the size of an Array");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        // Enter array
        System.out.println("Enter Array Elements");
        for(int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        // Enter the value of D positions
        System.out.println("Enter the Value of D");
        int d = scanner.nextInt();


        // if d is greater than n 
        d = d % n;

        for(int i = 1; i<=d; i++){
            LeftRotateAnElementByOne(arr);
        }

        for(int num :arr){
            System.out.print(num+ " ");
        }


    }
    

    static  void LeftRotateAnElementByOne(int arr[]) {
        int temp = arr[0];
        for(int i = 1; i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;

    }

}

