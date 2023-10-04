public class Calisan {
    private String ad;
    private String soyad;
    private String email;
    private int maas;

    public Calisan(String ad,String soyad,String email,int maas){
        this.ad=ad;
        this.soyad=soyad;
        this.email=email;
        this.maas=maas;

    }
    public void bilgileriGoster(){
        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyad);
        System.out.println("Email: "+email);
        System.out.println("Maas: "+maas);

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
}
