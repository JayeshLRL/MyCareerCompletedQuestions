import java.util.Scanner;

public class pattern15practiceonceagain {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n / 2;
        int nst = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            int ival = val; // this is inner value of pattern
            for (int j = 1; j <= nst; j++) {
                System.out.print(ival + "\t");
                if (j <= nst / 2) {
                    ival++;
                } else {
                    ival--;
                }
            }
                if (i <= n / 2) {
                    nst += 2;
                    nsp--;
                    val++;
                } else {
                    nsp++;
                    nst -= 2;
                    val--;
                }
                System.out.println();
            }
        }
    }

