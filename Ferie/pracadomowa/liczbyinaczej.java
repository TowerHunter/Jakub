import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class liczbyinaczej{
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("liczbyinaczej.txt");
        PrintWriter zapis= new PrintWriter("wynik.txt");
        Scanner in = new Scanner(file);
        String text;
        int text2;
        int ile = 0;
          while(in.hasNextLine())
        {
            text=in.nextLine();
            System.out.println(text);
        }
        zapis.close();
        }
        
        
   
    }