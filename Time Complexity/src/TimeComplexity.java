import java.util.Scanner;


public class TimeComplexity {


     public static void bubbleSort(int[]arr){
         for(int journey =1 ; journey <= arr.length -1 ;journey++){
             for(int j = 0 ; j <= arr.length -1 - journey ; j++){
                 if(isSmaller(arr , j+1 , j))
                 {
                     swap(arr , j+1 , j);
                 }
             }
         }
     }

    public static void swap (int[]arr , int i , int j){
        System.out.println("Swapping" + arr[i] +"and" +arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static  boolean isSmaller(int[]arr , int i , int j){
        System.out.println("Comparing" +arr[i] +"and" +arr[j]);
        if(arr[i] < arr[j]){
            return true;
        }
        else{
            return false;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        bubbleSort(arr);
        print(arr);
    }

}
