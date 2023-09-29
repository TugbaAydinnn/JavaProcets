import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //IF-ELSE
        //Kullanicidan yas ve cinsiyet bilgilerini al, erkek ve 18 yasından buyuk veya esit ise askere gidebilir,
        // aksi takdir de askere gidemez.

        Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen cinsiyetinizi giriniz (E/K): ");
        String cinsiyet=sc.next();

        System.out.print("Lutfen yasinizi giriniz: ");
        int yas=sc.nextInt();

        if ((cinsiyet.equals("e")||cinsiyet.equals("E")) && (yas>=18)) {
            System.out.println("Askere gidebilir.");
        }else{
            System.out.println("Askere gidemez.");
        }


        //if,  else if  ,else

        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi=sc.nextInt();
        if(sayi>0)
            System.out.println("pozitif sayi");
        else if(sayi<0)
            System.out.println("Negatif sayi");
        else if(sayi==0)
            System.out.println("Sifir");
        else
            System.out.println("Gecersiz islem...");

    }
}