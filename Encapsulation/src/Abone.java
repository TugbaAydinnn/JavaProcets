public class Abone {
    private String abene_isim;
    private  int bakiye=120;
    private  String sehir;

    public void bakiyeGoster(){
        System.out.println("Bakiyeniz: "+ bakiye);
    }
    public Abone(String isim, int bakiye, String sehir) {
        this.abene_isim = isim;
        if(bakiye<=120 && bakiye>=0)
            this.bakiye = bakiye;
        else
            System.out.println("Bakiyeniz minimum 0 tl , maksimum 120 TL olmalıdır.");
        this.sehir = sehir;
    }

    public String getIsim() {
        return abene_isim;
    }

    public void setIsim(String isim) {
        this.abene_isim = isim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        if(bakiye<=120 && bakiye>=0)
            this.bakiye = bakiye;
        else
            System.out.println("Bakiyeniz minimum 0 tl , maksimum 120 TL olmalıdır.");
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
