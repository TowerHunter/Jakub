import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;

public class napisy{
    int zj(String n){
        int ilez = 0;
        int ilej = 0;
        int s=0;
        for(int i=0;i<n.length()-1;i++){
            if(n.charAt(i)=='1') ilez++;
            else ilej++;
        }
        if(ilez==ilej) s++;
        return s;
    }
    int jedynki(String n){
        for(int i=0;i<n.length()-1;i++){
            if(n.charAt(i)=='0') return 0;
        }
        return 1;
    }
    int zera(String n){
        for(int i=0;i<n.length()-1;i++){
            if(n.charAt(i)=='1') return 0;
        }
        return 1;
    }
    
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("napisy.txt");
        PrintWriter zapis= new PrintWriter("wynik.txt");
        Scanner in = new Scanner(file);
        napisy funkcje = new napisy();
        int ile = 0;
        int ile2 = 0;
        int ile3 = 0;
        int ile4 = 0;
        int array[]=new int[15];
        for(int d=0;d<1000;d++){
            String text = in.nextLine();
            if(text.length()%2==0) ile++;
        ile3=ile3+funkcje.jedynki(text);
        ile2=ile2+funkcje.zera(text);
        for(int i=2;i<17;i++){
            if(text.length()==i){
                    array[i-2]++;
            }
        }
        ile4=ile4+funkcje.zj(text);
        }
        zapis.println("a)"+ile);
        System.out.println(ile4);
        zapis.println("b)"+ile4);
        zapis.println("c) Same zera: "+ile2);
        zapis.println("c) Same jedynki: "+ile3);
        zapis.println("d)"+Arrays.toString(array));
        zapis.close();
       
   
    }
}