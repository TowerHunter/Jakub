import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;

public class hasla{
    int c(String n){
        int s = 0;
        for(int i=0;i<n.length()-1;i++){
            if((int)(n.charAt(i))+(int)(n.charAt(i))==220) s=1;
        }
        return s;
    }
    
    int b(String n){
        int s = 0;
        for(int i=0;i<n.length()/2;i++){
                if(n.charAt(i)==n.charAt(n.length()-1-i)) s++;
                else s=0;
            }
        return s;
    }
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("hasla.txt");
        PrintWriter zapis= new PrintWriter("wynik4a.txt");
        PrintWriter zapis2= new PrintWriter("wynik4b.txt");
        PrintWriter zapis3= new PrintWriter("wynik4c.txt");
        Scanner in = new Scanner(file);
        hasla funkcje = new hasla();
        int ile = 0;
        int ile2 = 0;
        int ile3 = 0;
        while(in.hasNextLine()){
            String text = in.nextLine();
            if(text.length()%2==0) ile++;
            else ile2++;
            for(int i=0;i<text.length()/2;i++){
                if(text.charAt(i)==text.charAt(text.length()-1-i)) ile3+=1;
                else ile3=0;
            }
            if(funkcje.c(text)==1) zapis3.println(text);
            if(funkcje.b(text)==text.length()/2) zapis2.println(text);
        }
        zapis.println("parzyste: "+ile);
        zapis.println("nieparzyste: "+ile2);
        zapis3.close();
        zapis2.close();
        zapis.close();
        }
}
       
   