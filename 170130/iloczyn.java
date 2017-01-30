import java.util.Scanner;
public class iloczyn{
    public static void main(String[] args){
        if(args.length!=0){
        double iloczyn = 1;
        for(int i=0;i<args.length;i++){
            iloczyn = Double.parseDouble(args[i])*iloczyn;
        }
        System.out.format("%.2f%n", iloczyn);
        }
        else System.out.println("Bład danych");
    }
}