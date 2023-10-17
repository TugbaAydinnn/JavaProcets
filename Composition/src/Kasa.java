public class Kasa {
    private String marka;
    private String uretici;
    private String yapildigi_madde;

    public void bilgisayari_ac(){
        System.out.println("Bilgisayar Aciliyor...");
    }
    public Kasa(String marka, String uretici, String yapildigi_madde) {
        this.marka = marka;
        this.uretici = uretici;
        this.yapildigi_madde = yapildigi_madde;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getYapildigi_madde() {
        return yapildigi_madde;
    }

    public void setYapildigi_madde(String yapildigi_madde) {
        this.yapildigi_madde = yapildigi_madde;
    }
}
