import java.lang.Math; //math kütüphanesi eklendi
public class Main {
    public static void main(String[] args) {
        //java tip güvenli --> degisken tanımlarken tipi belirtmelisin
        //Değiskenler
        String satirAyir="********************************";
        int ogrenciSayisi=9; //Tam sayi
        System.out.println("Ogrenci Sayisi: "+ogrenciSayisi);
        System.out.println(satirAyir);

        Double piSayisi=3.14; //ondalikli sayi
        int kenarUzunlugu=5;
        Double daireninAlani=Math.pow(kenarUzunlugu,2)*piSayisi;//Math.pow(taban,us)
        System.out.println("Dairenin Alanı: "+daireninAlani);
        System.out.println(satirAyir);
        //primitive Types --> ilkel tipler --> değer bazlı boolean,char,int vb

        char karakter='A';
        System.out.println("Karakter: "+karakter);
        System.out.println(satirAyir);

        Boolean DaireinAlanıHesaplaniMi=true; //0 veya 1
        System.out.println("Dairein Alanı Hesaplani Mi? "+DaireinAlanıHesaplaniMi);
        System.out.println(satirAyir);
        //----------------------------------
        int a=3,b=5,toplam;
        toplam=a+b;
        System.out.print("toplam: "+toplam);
        //ilkel veri tipleri tamsayi tipleri-->byte,int,short,long
        //int 32bit (4byte) yer kaplıyor -2^31 2^31-1
        System.out.print("int icin max deger: "+Integer.MAX_VALUE);
        System.out.println();
        System.out.println("byte icin max deger:"+Byte.MAX_VALUE);

        //byte-->short--->int-->long
        short s1=1000;
        int s2=(s1/2); //otomatik donusturme var.(s1->shot,2->int)

        byte b1=100;
        byte b2=(byte)(b1/2); //int veri tipi byte cevrilmeli
        System.out.println(b2);

        short sayi1=100;
        byte sayi2=2;
        int sayi3=4;
        long toplamTest=sayi1+sayi2+sayi3;

        //ondalikli sayi tipleri
        //float--> 32bit-->4byte
        //double--> 64bit-->8byte
        float f1=0.14f;
        double d1=(f1+1.3f);//otomatik donusturme
        System.out.println(d1);

        int i1=(int)22f/7;
        System.out.println("i1: "+i1);


        float fSayi1=5;
        double dSayi2=fSayi1;
        System.out.println("dSayi2: "+dSayi2);

        //veri kaybi
        int i2=-129;
        byte b3=(byte)i2;
        System.out.println("b3: "+b3);

    }
}