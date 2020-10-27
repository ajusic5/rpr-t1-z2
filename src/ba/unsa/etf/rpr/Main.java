package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Unesite broj n: ");
        Scanner ulaz=new Scanner(System.in);
        int n=ulaz.nextInt();

        System.out.println("Brojevi od 1 do n koji su djeljivi sa zbirom svojih cifara su: ");

        for(int i=1; i<=n; i++){
            if(i%sumaCifara(i)==0) {
                System.out.println("" + i+" ");
            }
        }
    }

    private static int sumaCifara(int i) {

        int s=0;

        while(i!=0){
            s=s+i%10;
            i=i/10;
        }
        return s;
    }
}
