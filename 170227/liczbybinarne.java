import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
import java.math.BigInteger;

public class liczbybinarne{
    int zera(String n){
        int s = 0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='0') s++; 
        }
        if(s>(n.length()/2)) return 1;
        else return 0;
    }
    int podzielne2(String n){
        if(n.charAt(n.length()-1)=='0') return 1;
        else return 0;
    }
    int podzielne8(String n){
        if(n.charAt(n.length()-1)=='0'&&n.charAt(n.length()-2)=='0'&& n.charAt(n.length()-3)=='0') return 1;
        else return 0;
    }
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("liczbybinarne.txt");
        PrintWriter zapis= new PrintWriter("wynik.txt");
        Scanner in = new Scanner(file);
        liczbybinarne funkcje = new liczbybinarne();
        String text = in.nextLine();
        double text2 = Double.longBitsToDouble(new BigInteger(text, 2).longValue());
        double najw = text2;
        double najm = text2;
        int ile = 0;
        int ile2 = 0;
        int ile3 = 0;
        for(int i=0;i<1000;i++){
        text = in.nextLine();
        text2 = Long.parseLong(text, 2);
        ile = ile + funkcje.zera(text);
        ile2=ile2+funkcje.podzielne2(text);
        ile3=ile3+funkcje.podzielne8(text);
        if(text2>najw) najw = text2;
        if(text2<najm) najm = text2;
        }
        zapis.println(ile);
        zapis.println(ile2);
        zapis.println(ile3);
        zapis.println(najw);
        zapis.println(najm);
        zapis.close();
    }
}