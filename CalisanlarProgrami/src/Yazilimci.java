import java.util.ArrayList;

public class Yazilimci extends Calisan{
    private ArrayList<String> diller;

    public Yazilimci(String ad,String soyad,String email,int maas,ArrayList<String> diller){
        super( ad, soyad, email, maas);
        this.diller=diller;
    }

    public void formatAt(String isletimSistemi){
        System.out.println(getAd()+" "+isletimSistemi+" ni yukluyor..");
    }
    public void dilEkle(String dil){
        diller.add(dil);
        System.out.println("Islem basarili.");
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Yazilimcinin bildigi diller: "+diller);
    }
}
