import java.util.Scanner;

public class sort01 {
          public  static void sort011(int[]arr){
              int i  = 0 ;
              int j =0;
              while(i <arr.length){
                  if(arr[i] ==1 ){
                      i++;
                  }
                  else{
                      swap(arr , i , j);
                      i++;
                      j++;
                  }
              }


          }



    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i <arr.length ;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        sort011(arr);
        print(arr);
    }

}
