public class zad1{
    int pierwsza(int a){
        if(a>2){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0) return 0;
        }
        }
        return 1;
    }
    public static void main(String[] args){
        zad1 funkcja = new zad1();
        int b = Integer.parseInt(args[0]);
        System.out.println(funkcja.pierwsza(b));
        
    }
}