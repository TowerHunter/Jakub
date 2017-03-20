import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class liczby{
    int sumacyfr(int n){
        int s=0;
        while(n>0)
        {s=s+n%10;
         n=n/10;    
        }
        return s;
    }
    String czworkowy(int n){
        String tekst = "";
        do{
            tekst=tekst+(char)(n%4+48);
            n=n/4;
        }while(n>0);
        String reverse="";
        for(int i=tekst.length()-1;i>=0;i--){
            reverse=reverse+tekst.charAt(i);
        }
        return reverse;
        
    }
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("liczby.txt");
        PrintWriter zapis= new PrintWriter("wynik.txt");
        Scanner in = new Scanner(file);
        liczby funkcje = new liczby();
        int suma1=0;
        int suma2=0;
        String temp="";
        while(in.hasNextLine()){
            String text=in.nextLine();
            int liczba=Integer.parseInt(text);
            suma1=funkcje.sumacyfr(liczba);
            if(suma1>suma2) suma2=suma1;
            temp=funkcje.czworkowy(liczba);
            zapis.println(liczba+"-"+temp);
        }
        zapis.println(suma2);
        zapis.close();
    }
}