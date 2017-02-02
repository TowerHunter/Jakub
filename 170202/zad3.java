import java.util.Arrays;
import java.util.Random;
public class zad3{
    public static void main(String[] args){
        Random rand = new Random();
        int [] A = new int[10];
        for(int i = 0;i<10;i++){
            A[i]= rand.nextInt(11)+0;
        }
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }
}