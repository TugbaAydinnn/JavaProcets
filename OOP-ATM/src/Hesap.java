public class Hesap {
    Double bakiye;
    String hesapNo;

    String kullaniciAdi;
    String parola;

    public Hesap(Double bakiye,String hesapNo,String kullaniciAdi,String parola){
        this.bakiye=bakiye;
        this.hesapNo=hesapNo;
        this.kullaniciAdi=kullaniciAdi;
        this.parola=parola;
    }
    public void bilgileriGoster(){
        System.out.println("Hesap numaranız :"+hesapNo);
        System.out.println("Bakiyeniz :"+bakiye);
        System.out.println("Kullanici Adiniz: :"+kullaniciAdi);
    }
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }



    public Double getBakiye() {
        return bakiye;
    }

    public void setBakiye(Double bakiye) {
        this.bakiye = bakiye;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public Double paraCekme(double miktar){
        if(bakiye<miktar)
            System.out.println("Yetersiz bakiye. Mevcut bakiyeniz: "+bakiye);
        else{
            bakiye-=miktar;
            System.out.println("Guncel bakiyeniz: "+bakiye);
        }
        return bakiye;
    }
    public Double paraYatirma(Double miktar){
        bakiye+=miktar;
        System.out.println("Guncel bakiyeniz: "+bakiye);
        return bakiye;
    }
}
