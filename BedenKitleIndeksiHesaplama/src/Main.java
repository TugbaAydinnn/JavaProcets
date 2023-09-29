import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Kullanicidan alinan boy ve kilo degerine gore kullanicinin beden kitle indeksini hesaplama
        * Beden kitle indeksi=Kilo(kg)/Boy(m)*Boy(m)
        * */

        Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen kilonuzu giriniz: ");
        Double kilo=sc.nextDouble();

        System.out.print("Lutfen boyunuzu giriniz: ");
        Double boy=sc.nextDouble();

        //BKE=Beden kitle indeksi
        Double BKI=kilo/Math.pow(boy,2);
        System.out.println("Vucut kitle indeksiniz: "+BKI);
    }
}