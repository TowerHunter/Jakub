import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Funkcje3{
   String pierwsza(int a){
        if(a>2){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0) {
                return a+" Nie jest liczbą pierwszą";
            }
        }
        }
        return a+" Jest liczbą pierwszą";
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Funkcje3 funkcja = new Funkcje3();
        Random rand = new Random();
        int a;
        for(int i=0;i<10;i++){
        a = rand.nextInt(99)+0;
        System.out.println(funkcja.pierwsza(a));   
        }
    }
}