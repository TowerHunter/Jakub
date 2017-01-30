import java.util.Scanner;
public class BMI2{
    public static void main(String[] args){
        int c;
        do{
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swoją wagę(bez oszukiwania): ");
        double waga = in.nextDouble();
        System.out.println("Podaj swój wzrost: ");
        double wzrost = in.nextDouble();
        double BMI = waga/(wzrost*wzrost);
        System.out.println("Twoje BMI to: "+BMI);
        if(BMI<18.5) System.out.println("Niedowaga");
        else if(BMI>=18.5 && BMI <= 24.99) System.out.println("Waga prawidłowa");
        else System.out.println("Nadwaga");
        do{
        System.out.println("Chcesz kontynuować? 1-tak 2-nie");
            c=in.nextInt();
        }while(c!=1 && c!=2);
        }while(c==1);
    }
}