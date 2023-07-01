import java.util.Scanner;

public class PrintMazePathsUsingRecursion {

    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int rows = scn.nextInt();
            int cols = scn.nextInt();
            PrintMazePath(1 , 1 ,rows ,cols, "");
    }

    public static void PrintMazePath(int sr , int sc ,int dr , int dc , String psf){
            if(sr == dr && sc == dc){
                System.out.println(psf);
                return;
            }
            else if(sr > dr || sc > dc){
                return;
            }
            PrintMazePath(sr+1 ,sc , dr  , dc ,psf+"h" );
            PrintMazePath(sr , sc+1 , dr , dc , psf+"v");
    }
}
