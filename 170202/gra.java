import java.util.Random;
public class gra{
    public static void main(String[] args){
        Random rand = new Random();
        int losowa = rand.nextInt(2)+0;
        if(args.length==1){
        int podana = Integer.parseInt(args[0]);
        if(podana == 1 || podana ==0){
        if(podana == losowa){
            System.out.println("Wygrałeś");
        }
        else System.out.println("Przegrałeś");
    }
    else System.out.println("Błąd danych");
    }
    else System.out.println("Błąd danych");
}
}