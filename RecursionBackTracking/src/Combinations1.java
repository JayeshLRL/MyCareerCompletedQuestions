import java.util.*;
import java.io.*;
public class Combinations1 {



        public static void combinations(int cb, int tb, int ssf, int ts, String asf){
            // write your code here
            if(cb > tb){
                if(ssf == ts){
                    System.out.println(asf + "");
                }
                return;
            }


            //ya toh mai aaunga
            combinations(cb + 1, tb , ssf + 1, ts , asf +"i");
            //ya mai nahi aaunga fuck uh
            combinations(cb + 1, tb , ssf +0, ts , asf +"-");
        }


        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int nboxes = Integer.parseInt(br.readLine());
            int ritems = Integer.parseInt(br.readLine());
            combinations(1, nboxes, 0, ritems, "");
        }

    }
