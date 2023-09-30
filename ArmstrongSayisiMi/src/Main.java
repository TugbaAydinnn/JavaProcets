import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> basamaklarinDegeri=new ArrayList();


        Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi=sc.nextInt();
        int hafiza=sayi; //ekrandan girilen sayi degerinin kaybolmamasi icin

        int kalan=0;
        int i=0;
        int sonuc=0;

        
        do {
            kalan=sayi%10;
            sayi=sayi/10;
            basamaklarinDegeri.add(kalan);
        }while (sayi>0);



        int kacBasamakli=basamaklarinDegeri.size();
        while(i<kacBasamakli){
            sonuc= (int) (sonuc+Math.pow(basamaklarinDegeri.get(i),kacBasamakli));
            i++;
        }


        if(sonuc==hafiza){
            System.out.println("Armstrong sayidir.");
        }
        else{
            System.out.println("Armstrong sayi değildir.");
        }

    }
}