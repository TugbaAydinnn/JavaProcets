public class Monitor {
    private String model;
    private String uretici;
    private String inch;
    private Resolution resolution ;// composition

    public void monitoru_kapat(){
        System.out.println("Monitor Kapatılıyor...");
    }
    public Monitor(String model, String uretici, String inch, Resolution resolution) {
        this.model = model;
        this.uretici = uretici;
        this.inch = inch;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getInch() {
        return inch;
    }

    public void setInch(String inch) {
        this.inch = inch;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
