import java.util.Scanner;
public class Funkcje4{
   void Cyfry(int a){
       do{
           System.out.print(a%10+" ");
           a=a/10;
       }while(a!=0);
       
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a;
        Funkcje4 funkcja = new Funkcje4();
        System.out.println("Podaj liczbę: ");
        a = in.nextInt();
        funkcja.Cyfry(a);
    }
}