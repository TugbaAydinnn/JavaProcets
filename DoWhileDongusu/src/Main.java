import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //do while dongusu
        /*
            int sayi=5;
            int faktoriyel=1;
            do{
                faktoriyel*=sayi;
                sayi--;
            }while (sayi>0);
            System.out.println("Sonuc: "+faktoriyel);

         */
        //Bir sayinin rakamlari toplamini do-while kullanarak hesaplama

        Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        double sayi=sc.nextDouble();
        double basamakDegeri=0;
        double toplam=0;
        int i=1;
        int j=0;
        double us=0;


        do{
            basamakDegeri=sayi%(Math.pow(10,i));
            sayi=sayi-basamakDegeri;
            i++;
            us=Math.pow(10,j);
            toplam=toplam+basamakDegeri/(us);
            j++;
        }while (sayi>0);
        System.out.println("Basamaklari toplami: "+toplam);

    }
}