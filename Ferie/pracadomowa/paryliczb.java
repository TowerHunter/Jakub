import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class paryliczb{
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("PARY_LICZB.txt");
        PrintWriter zapis= new PrintWriter("wynik2.txt");
        Scanner in = new Scanner(file);
        String text = in.nextLine();
        int text2 = Integer.parseInt(text);
        int najw = text2;
        while(in.hasNextLine())
        {
            text = in.nextLine();
            text2 = Integer.parseInt(text);
            if(text2>najw){
                najw=text2;
            }
        }
        zapis.println(najw);
        zapis.close();
        }
        
   
    }