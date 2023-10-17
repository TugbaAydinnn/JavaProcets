public class Main {
    public static void main(String[] args) {

        Abone abone=new Abone("Ali Yilmaz",100,"Ankara"); //Encapsulation 1. avantaj-->degiskenlere deger vermeyi unutamazsın. Java hata veriyor
        abone.bakiyeGoster();

        //Encapsulation 1. avantaj-->bakiye degiskenine sınır koyuldu 200 tl gonderilse bile 120 olarak default degeri alacak
        Abone abone2=new Abone("Ayse Guner",200,"Istanbul");
        abone2.bakiyeGoster();
        //abone2.setBakiye(300);
        //abone2.bakiyeGoster();
    }
}