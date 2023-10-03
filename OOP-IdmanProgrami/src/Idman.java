public class Idman {
    private  int burpeeSayisi;
    private int pushUpSayisi;
    private int sitUpSayisi;
    private int squatSayisi;


    public Idman(int burpeeSayisi,int pushUpSayisi,int sitUpSayisi,int squatSayisi){
        this.burpeeSayisi=burpeeSayisi;
        this.pushUpSayisi=pushUpSayisi;
        this.sitUpSayisi=sitUpSayisi;
        this.squatSayisi=squatSayisi;

    }
    public void hareketYap(String hareketTuru,int sayi){

        if (hareketTuru.equals("burpee")){
            burpeeYap(sayi);
        }
        else if(hareketTuru.equals("pushUp")){
            pushUpYap(sayi);
        }
        else if(hareketTuru.equals("sitUp")){
            sitUpYap(sayi);
        }
        else if(hareketTuru.equals("squat")){
            squatUpYap(sayi);
        }
        else{
            System.out.println("Hatali islem");
        }

    }
    private void burpeeYap(int sayi){
        if((burpeeSayisi==0)){
            System.out.println("Tebrikler burpee miktarini tamamladiniz.");
            System.out.println("Kalan burpee=0");
        }

        if(burpeeSayisi-sayi<0){
            System.out.println("Tebrikler burpee miktarini tamamladiniz.");
            burpeeSayisi=0;
            System.out.println("Kalan burpee="+burpeeSayisi);
        }else {
            burpeeSayisi-=sayi;
            System.out.println("Kalan burpee="+burpeeSayisi);
        }

    }

    private void sitUpYap(int sayi){
        if((sitUpSayisi==0)){
            System.out.println("Tebrikler sitUp miktarini tamamladiniz.");
            System.out.println("Kalan sitUp=0");
        }

        if(sitUpSayisi-sayi<0){
            System.out.println("Tebrikler sitUp miktarini tamamladiniz.");
            sitUpSayisi=0;
            System.out.println("Kalan sitUp="+sitUpSayisi);
        }else {
            sitUpSayisi-=sayi;
            System.out.println("Kalan sitUp="+sitUpSayisi);
        }

    }

    private void pushUpYap(int sayi){
        if((pushUpSayisi==0)){
            System.out.println("Tebrikler pushUp miktarini tamamladiniz.");
            System.out.println("Kalan pushUp=0");
        }

        if(pushUpSayisi-sayi<0){
            System.out.println("Tebrikler pushUp miktarini tamamladiniz.");
            pushUpSayisi=0;
            System.out.println("Kalan pushUp="+pushUpSayisi);
        }else {
            pushUpSayisi-=sayi;
            System.out.println("Kalan pushUp="+pushUpSayisi);
        }

    }

    private void squatUpYap(int sayi){
        if((squatSayisi==0) ){
            System.out.println("Tebrikler squat miktarini tamamladiniz.");
            System.out.println("Kalan squat=0");
        }

        if(squatSayisi-sayi<0){
            System.out.println("Tebrikler squat miktarini tamamladiniz.");
            squatSayisi=0;
            System.out.println("Kalan squat="+squatSayisi);
        }else {
            squatSayisi-=sayi;
            System.out.println("Kalan squat="+squatSayisi);
        }

    }
    public boolean idmanBittiMi(){
        return (squatSayisi==0) && (burpeeSayisi==0) && (sitUpSayisi==0) && (pushUpSayisi==0) ;
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushUpSayisi() {
        return pushUpSayisi;
    }

    public void setPushUpSayisi(int pushUpSayisi) {
        this.pushUpSayisi = pushUpSayisi;
    }

    public int getSitUpSayisi() {
        return sitUpSayisi;
    }

    public void setSitUpSayisi(int sitUpSayisi) {
        this.sitUpSayisi = sitUpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
}
