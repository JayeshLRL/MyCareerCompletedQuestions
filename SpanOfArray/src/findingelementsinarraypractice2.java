
import java.util.Scanner;

public class findingelementsinarraypractice2 {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }

            int num = scn.nextInt();

            int erika = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    erika = i;
                    break;
                }
            }
            System.out.println(erika);
        }
    }
