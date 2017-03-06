import java.util.Scanner;

public class systemy{
    String DecToBin(int n){
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
    
    public static void main(String [] args){
        systemy funkcje=new systemy();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(funkcje.DecToBin(n));
        
        
}
}