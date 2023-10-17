

class Hayvan{
    //super class
    private String isim;
    public String konus(){
        return "Hayvan konusuyor...";
    }
    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

class Kedi extends Hayvan{
    //sub class
    public Kedi(String isim){
        super(isim);
    }

    @Override
    public String konus() {
        return super.getIsim()+" miyavlıyor..";
    }
}
class Kopek extends Hayvan{
    //sub class
    public Kopek(String isim){
        super(isim);
    }

    @Override
    public String konus() {
        return super.getIsim()+" havlıyor...";
    }
}
public class Main {
    public static void konus(Hayvan hayvan){
        System.out.println(hayvan.konus());

    }
    public static void main(String[] args) {
        /*
        //hayvan referansı kedi referansı eşitledik.
        Hayvan hayvan=new Kedi("Tekir"); //polymorphism
        System.out.println(hayvan.konus());

        Hayvan hayvan1=new Kopek("Karabas"); //polymorphism
        System.out.println(hayvan1.konus());
        */
        konus(new Kopek("Karabas"));
        konus(new Kedi("Hera"));
    }
}