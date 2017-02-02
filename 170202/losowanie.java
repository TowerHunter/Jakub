import java.util.Random;
public class losowanie{
    public static void main(String[] args){
        if(args.length==2){
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        Random rand = new Random();
        int losowa = rand.nextInt(q-p+1)+p;
        System.out.println(losowa);
        }
        else System.out.println("Błąd danych");
    }
}