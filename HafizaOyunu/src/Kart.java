public class Kart {
    private char deger;
    private boolean isTahmin=false;

    public Kart(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return isTahmin;
    }

    public void setTahmin(boolean tahmin) {
        isTahmin = tahmin;
    }
}
