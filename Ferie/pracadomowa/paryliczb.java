import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;

public class paryliczb{
    int suma(int n){
        int s=0;
        while(n>0)
        {s=s+n%10;
         n=n/10;    
        }
        return s;
    }

    int nwd(int liczba, int liczba2){
        while(liczba!=liczba2){
            if(liczba > liczba2) liczba -= liczba2;
            else liczba2 -= liczba; 
        }
        return liczba;
    }
    
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("PARY_LICZB.TXT");
        PrintWriter zapis= new PrintWriter("wynik2.txt");
        Scanner in = new Scanner(file);
        paryliczb funkcje = new paryliczb();
        int liczba = 0;
        int liczba2 = 0;
        int ile = 0;
        int ile2 = 0;
        int ile3 = 0;
        int nwd = 0;
        int suma1 = 0;
        int suma2 = 0;
        for(int i=0;i<1000;i++){
            liczba = in.nextInt();
            liczba2 =in.nextInt();
            if(liczba2/liczba!=0) ile++;
            nwd = funkcje.nwd(liczba, liczba2);
            if(nwd==1) ile2++;
            suma1 = funkcje.suma(liczba);
            suma2 = funkcje.suma(liczba2);
            if(suma1 == suma2) ile3++;
        }
        zapis.println(ile);
        zapis.println(ile2);
        zapis.println(ile3);
        zapis.close();
   
    }
}