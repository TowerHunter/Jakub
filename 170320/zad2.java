import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class zad2{
    int BinToDec(String str){
        double j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== '1'){
            j=j+ Math.pow(2,str.length()-1-i);
     }

    }
    return (int) j;
        }
    
    public static void main(String [] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        zad2 funkcje = new zad2();
        String s=in.nextLine();
        Double pop=0.0;
        char a=s.charAt(s.length()-2);
        char d=s.charAt(s.length()-1);
        if(a=='1' && d=='1') pop = 0.75;
        else if(a=='1' && d=='0') pop = 0.50;
        else if(a=='0' && d=='1') pop = 0.25;
        String temp = s.substring(0, s.length()-3);
        int liczba = funkcje.BinToDec(temp);
        Double w = liczba + pop;
        System.out.println(w);
        

    }
}