import java.io.*;
import java.util.*;
public class NknightsCombinations2dAs1dKnightChooses {



        public static boolean IsKnightSafe(boolean[][] chess, int i, int j) {
            // write your code here
            for(  int row = i - 2 , col = j + 1 ; row >= 0 && col < chess.length ; row-- , col++){
                if(chess[row][col]){
                    return false;
                }
            }

            for(  int row = i - 1 , col = j + 2 ; row >= 0 && col< chess.length ; row-- , col++){
                if(chess[row][col]){
                    return false;
                }
            }
            for(  int row = i - 1 , col = j -2 ; row >= 0 && col>= 0; row-- , col--){
                if(chess[row][col]){
                    return false;
                }
            }
            for( int  row = i - 2 , col = j -1 ; row >= 0 && col >= 0 ; row-- , col--){
                if(chess[row][col]){
                    return false;
                }
            }

            return true;

        }

        public static void nknights(int kpsf, int tk, boolean[][] chess, int lcno) {
            if (kpsf == tk) {
                for (int row = 0; row < chess.length; row++) {
                    for (int col = 0; col < chess.length; col++) {
                        System.out.print(chess[row][col] ? "k\t" : "-\t");
                    }
                    System.out.println();
                }
                System.out.println();
                return;
            }

            for (int i = lcno + 1; i < chess.length * chess.length; i++) {
                int row = i / chess.length;
                int col = i % chess.length;

                if (chess[row][col] == false && IsKnightSafe(chess, row, col)) {
                    chess[row][col] = true;
                    nknights(kpsf + 1, tk, chess, row * chess.length + col);
                    chess[row][col] = false;
                }
            }
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            boolean[][] chess = new boolean[n][n];

            nknights(0, n, chess, -1);
        }
    }
