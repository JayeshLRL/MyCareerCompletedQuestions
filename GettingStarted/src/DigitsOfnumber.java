import java.util.Scanner;

public class DigitsOfnumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int div = 0;
        int temp = n ;
        while( temp>=10 ){
              temp = temp/10;
              div *=10;
        }
        while( div >= 1){
            int q= n/div;
            int r = n % div;
            System.out.println(q);
            n  = r;
            div= div/10;
        }
    }
}
