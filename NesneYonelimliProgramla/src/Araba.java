public class Araba {
    private int tekerSayisi;
    private int KapiSayi;
    private String renk;
    private String marka;



    public static int sayac; //nesne olusturulmadan da bu ozellik baska class'larda çağırabilir.
    //

    //Yapiici metod
    public  Araba(int tekerSayisi,String marka,int KapiSayi, String renk){
        this.tekerSayisi=tekerSayisi;
        this.marka=marka;
        this.KapiSayi=KapiSayi;
        this.renk=renk;


    }

    public Araba(){
        this(0,"Bilgi Yok",0,"Bilgi Yok");
    }
    public void arabaOzellikYazdir(){
        System.out.println("tekerSayisi: "+tekerSayisi);
        System.out.println("marka: "+marka);
        System.out.println("KapiSayi: "+KapiSayi);
        System.out.println("renk: "+renk);
    }

    public Araba(String renk){

        System.out.println("renk"+renk);

    }
    public int getTekerSayisi(){
        return tekerSayisi;
    }
    public void setTekerSayisi(int tekerSayisi){
        if(tekerSayisi>0)
            this.tekerSayisi=tekerSayisi;
        else
            System.out.println("teker sayisi negatif veya 0 olamaz");
    }

    public int getKapiSayi() {
        return KapiSayi;
    }

    public void setKapiSayi(int kapiSayi) {
        KapiSayi = kapiSayi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }


    //Obje olusturmadan bu metodu cagirabiliriz.
    public static void Deneme1(){
        System.out.println("deneme");
    }
}
