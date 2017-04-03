import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;

public class powtorzenie{
    int sumacyfr(int n){
        int s=0;
        while(n>0)
        {s=s+n%10;
         n=n/10;    
        }
        return s;
    }
    String x(int n){
        String tekst = "";
        do{
            tekst=tekst+(char)(n%2+48);
            n=n/2;
        }while(n>0);
        String reverse="";
        for(int i=tekst.length()-1;i>=0;i--){
            reverse=reverse+tekst.charAt(i);
        }
        return reverse;
        
    }
    int ciag(String n){
        for(int i=0;i<n.length()-1;i++){
            if((int)(n.charAt(i))<=(int)(n.charAt(i+1))) return 0;
        }
        return 1;
    }
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("cyfry.txt");
        PrintWriter zapis= new PrintWriter("powt.txt");
        Scanner in = new Scanner(file);
        powtorzenie funkcje = new powtorzenie();
        int ile=0;
        int suma = 0;
        int ile2=0;
        zapis.println("c)");
        while(in.hasNextLine()){
            String text = in.nextLine();
            int liczba = Integer.parseInt(text);
            if(text.length()%2==0) ile++;
            if(suma<funkcje.sumacyfr(liczba)) suma = funkcje.sumacyfr(liczba);
            if(liczba<10000) zapis.println(liczba +"----"+ funkcje.x(liczba));
            ile2+=funkcje.ciag(text);
            
            
        }
        zapis.println("a)"+ile);
        zapis.println("b)"+suma);
        zapis.println("d)"+ile2);
        zapis.close();
   
    }
}