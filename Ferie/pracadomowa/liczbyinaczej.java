import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class liczbyinaczej{

    
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("liczbyinaczej.txt");
        PrintWriter zapis= new PrintWriter("wynik.txt");
        Scanner in = new Scanner(file);
        String text = in.nextLine();
        int text2 = Integer.parseInt(text, 2);
        int max = text2;
        int ile = 0;
        int ile2 = 0;
        int suma = text2;
        while(in.hasNextLine())
        {
            text = in.nextLine();
            text2 = Integer.parseInt(text, 2);
            if(text2>max) max=text2;
            if(text2%2==0) ile++;
            if(text.length()==9){ 
                ile2++;
                suma = suma + text2;
            }
            
        }
        zapis.println("a)"+ile);
        zapis.println("b)"+max);
        zapis.println("  "+Integer.toBinaryString(max));
        zapis.println("c)"+ile2);
        zapis.println("  "+suma);
        zapis.close();


        }
        
   
    }