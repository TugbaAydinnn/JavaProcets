public class Calisan {
    private String adSoyad;
    private String email;
    private int maas;


    public Calisan(String adSoyad,String email, int maas){
        this.adSoyad=adSoyad;
        this.email=email;
        this.maas=maas;
    }
    public void bilgileriGoster(){
        System.out.println("Ad ve Soyad: "+adSoyad);
        System.out.println("Email: "+email);
        System.out.println("Maas: "+maas);
    }

    public void ortakMetod(){
        //sub class ve super class da aynı isme sahip iki metod tanımlandı.
        //overriding (sub class super class'ın metodunu ezer.)
        System.out.println("Super class");
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
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
