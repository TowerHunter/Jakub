import java.util.Scanner;
public class Funkcje2{
   String pierwsza(int a){
        if(a>2){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0) return "Nie jest";
        }
        }
        return "Jest";
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,c;
        do{
        Funkcje2 funkcja = new Funkcje2();
        System.out.println("Podaj liczbę: ");
        a = in.nextInt();
        System.out.println(funkcja.pierwsza(a));
        System.out.println("Chcesz kontynuować? 1-tak 2-nie");
        c = in.nextInt();
        }while(c==1);
    }
}