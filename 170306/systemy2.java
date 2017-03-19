import java.util.Scanner;

public class systemy2{
    int BinToDec(int n){
        //String tekst = "";
        int decimal = 0;
        int p=0;
        do{
            int temp = n%10;
          decimal += temp*Math.pow(2, p);
          n = n/10;
          p++;
        }while(n>0);
       return decimal;
        }
    
    public static void main(String [] args){
        systemy2 funkcje=new systemy2();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(funkcje.BinToDec(n));
}
}