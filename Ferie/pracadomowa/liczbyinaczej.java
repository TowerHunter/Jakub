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
        int text2 = Integer.parseInt(text);
        int ile = 0;
          while(in.hasNextLine())
        {
            text=in.nextLine();
            text2=Integer.parseInt(text);
            System.out.println(text2);
        }
        }
        
   
    }