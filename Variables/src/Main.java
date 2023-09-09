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




    }
}