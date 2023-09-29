import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //For dongusu
        /*
            for(int i=0;i<10;i++){
                System.out.println("i = "+i);
            }
        */
        /*
            String[] arabalar = {"BMW", "Mercedes", "Ford", "Ferrari"}; //dizi
            for (String i : arabalar) {
                System.out.println(i);
            }
        */

        Scanner sc=new Scanner(System.in);
        System.out.print("Faktoriyeli alinacak sayiyi giriniz: ");
        int sayi=sc.nextInt();
        int sonuc=1;
        for(int i=1;i<=sayi;i++){
            sonuc=sonuc*i;
        }
        System.out.println(sayi+"  sayinin faktoriyeli "+sonuc+" olarak hesaplandi.");


    }
}