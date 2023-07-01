
import java.util.*;
import java.io.*;

public class differenceArrayscodeforces {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int j = 0; j < t; j++) {//ek loop chalaya theek hai baraabar
            int n = scn.nextInt();//array kitne size ki honi chahiye uska input liya baraabar
            int[] arr = new int[n];//phir ek array bnaya jiske andar size daala
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();//aur array ka input daala
            }


            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                int diff = arr[i] - i;
                int diffFreq = map.getOrDefault(diff, 0);
                map.put(diff, diffFreq + 1);
            }

            long ans = 0;

            for (int key : map.keySet()) {
                long keyFreq = (long) map.getOrDefault(key, 0);
                long ansByFormula = keyFreq * (keyFreq - 1) / 2;
                ans += ansByFormula;
            }

            System.out.println(ans);
        }
    }
}

