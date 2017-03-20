import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class zad1{
    int jedynki(String n){
        int ile=0;
        for(int i=0;i<=n.length()-1;i++){
            if(n.charAt(i)=='1')ile++;
            else;
        }
        return ile;
    }
    
    String DecToBin(int n){
        String tekst="";
        do{
            tekst = tekst+(char)(n%2+48);
            n=n/2;
        }while(n>0);
        String reverse="";
        for(int i=tekst.length()-1;i>=0;i--){
            reverse=reverse+tekst.charAt(i);
        }
        return reverse;
    }
    public static void main(String [] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        zad1 funkcje = new zad1();
        int l=0;
        int s=in.nextInt();
        String bin = funkcje.DecToBin(s);
        System.out.println(bin);
        l=funkcje.jedynki(bin);
        System.out.println(l);

    }
}