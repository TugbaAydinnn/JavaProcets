import jdk.jshell.execution.JdiInitiator;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*ArrayList<String> diller=new ArrayList<>();
        diller.add("Java");
        Yazilimci yazilimci= new Yazilimci("Ali","Yilmaz","ali@gmail.com",2500,diller);
        yazilimci.dilEkle("Python");
        System.out.println("****************");
        yazilimci.bilgileriGoster();


        System.out.println("****************");
        Yonetici yonetici=new Yonetici("Ayse","Yildiz","ayse@gmail.com",1000,1);
        yonetici.zamYap(50);
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Calisanlar Programina Hosgeldiniz...");
        String mesaj="İslemler...\n" +
                "1. Yazilimci Islemleri\n" +
                "2. Yonetici Islermleri\n" +
                "Cıkıs icin q";

        String islem,ad,soyad,email;
        ArrayList<String> diller=new ArrayList<>();
        int maas,kisiSayisi;

        do {
            System.out.println(mesaj);
            islem=sc.nextLine();

            System.out.print("Lutfen Adinizi giriniz: ");
            ad=sc.nextLine();

            System.out.print("Lutfen Soydinizi giriniz: ");
            soyad=sc.nextLine();
            System.out.print("Lutfen Email giriniz: ");
            email=sc.nextLine();

            System.out.print("Lutfen Maas giriniz: ");
            maas=sc.nextInt();

            sc.nextLine();
            switch (islem){
                case "1":
                    System.out.println("Bildiginiz dili giriniz:");
                    diller.add(sc.nextLine());//arraylist ile scanner kullanimi
                    Yazilimci yazilimci=new Yazilimci(ad,soyad,email,maas,diller);
                    yazilimci.bilgileriGoster();
                    break;
                case "2":
                    System.out.println("Sorumlu oldugunu kisi sayisini giriniz: ");
                    kisiSayisi= sc.nextInt();
                    Yonetici yonetici=new Yonetici(ad,soyad,email,maas,kisiSayisi);
                    yonetici.bilgileriGoster();
                    break;
            }
        } while (!islem.equals("q"));
    }

}