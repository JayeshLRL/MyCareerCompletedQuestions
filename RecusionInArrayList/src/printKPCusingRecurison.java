import java.util.Scanner;

public class printKPCusingRecurison {


    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       printKPC(str, "");
    }

    static String[] codes = {".;" , "abc" ,"def" ,"ghi" ,"jkl" ,"mno","pqrs" ,"tu" ,"vwx" ,"yz"};

    public static void printKPC(String str , String ans){


        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);


        String codeforch = codes[ch - '0'];

        for(int i = 0 ; i<codeforch.length() ; i++){
            char cho = codeforch.charAt(i);
            printKPC(ros , ans +cho);
        }
    }
}
