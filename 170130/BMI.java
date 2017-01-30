public class BMI{
    public static void main(String[] args){
        if(args.length==2){
        double waga = Double.parseDouble(args[0]);
        double wzrost = Double.parseDouble(args[1]);
        double BMI = waga/(wzrost*wzrost);
        if(BMI<18.5) System.out.println("Niedowaga");
        else if(BMI>=18.5 && BMI <= 24.99) System.out.println("Waga prawidłowa");
        else System.out.println("Nadwaga");
    }
    else System.out.println("Błąd danych");
    }
}