public class Yonetici extends Calisan{
    //Yonetici-->sub class
    //Calisan-->super class
    private int sorumluOldKisiSayisi;
    public Yonetici(String adSoyad,String email,int maas,int sorumluOldKisiSayisi){
        super(adSoyad,email,maas);
        this.sorumluOldKisiSayisi=sorumluOldKisiSayisi;
    }


    public void zamYap(int zam){
        System.out.println("Calisanlara "+zam+" tl zam yapildi");
    }

    public void ortakMetod(){
        //sub class ve super class da aynı isme sahip iki metod tanımlandı.
        //overriding (sub class super class'ın metodunu ezer.)
        System.out.println("Sub class");
    }public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("sorumlu Oldugu  Kisi Sayisi: "+sorumluOldKisiSayisi);
    }

}
