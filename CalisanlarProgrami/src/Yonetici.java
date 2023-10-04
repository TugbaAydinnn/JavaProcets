public class Yonetici extends Calisan{
    private int sorumluKisi;
    public Yonetici(String ad,String soyad,String email,int maas,int sorumluKisi){
        super( ad, soyad, email, maas);
        this.sorumluKisi=sorumluKisi;
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Sorumlu Oldugu Kisi Sayisi: "+sorumluKisi);
    }
    public void zamYap(int zam){
        System.out.println(getAd()+" calisanlara "+zam+" tl zam yapti");
    }
}
