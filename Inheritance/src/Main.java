// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Yonetici yonetici=new Yonetici("AliYilmaz","ali@gmail.com",2500,1);
        //yonetici.bilgileriGoster(); //super class'ın metodu
        yonetici.zamYap(100);//sub class metod
        yonetici.ortakMetod();//sub class'da yazan metod çalıştı.(overriding)
        System.out.println("****************************");
        yonetici.bilgileriGoster();//sonradan sub class için de aynı tanımlama yapildi(overriding)
    }
}