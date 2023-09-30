import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Faktoriyeli alinacak sayiyi giriniz: ");
        int sayi=sc.nextInt();
        faktoriyelHesapla(sayi);

        //topla metodu int tipli deger  dondurur
        int ikiSatininToplami=topla(5,2);
        System.out.println("İki sayinin toplami: "+ikiSatininToplami);

        //System.out.println("Uc sayinin toplami: "+topla(1,2,3));
        topla(1,2,3);
    }
    //erisim belirleyici-->public,private
    //void-->donus tipi yok


    //parameteli metod
    public static void faktoriyelHesapla(int sayi){
        int faktoriyel=1;
        for(int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }
        System.out.println("Faktoriyel: "+faktoriyel);

    }

    public static int topla(int s1,int s2){
        return s1+s2;

    }

    //overloading
    public static void topla(int a,int b, int c){
        //return  a+b+c;
        System.out.println("deneme"+(a+b+c));
    }

}
