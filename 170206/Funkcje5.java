import java.util.Scanner;
public class Funkcje5{
   int Rosnaca(int a){
       int max = a%10;
       a=a/10;
        do{
           if(max<a%10) return 0;
           max = a%10;
           a=a/10;
       }while(a!=0);
        return 1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a;
        Funkcje5 funkcja = new Funkcje5();
        System.out.println("Podaj liczbę: ");
        a = in.nextInt();
        System.out.println(funkcja.Rosnaca(a));
    }
}