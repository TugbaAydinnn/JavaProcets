public class Main {
    public static void main(String[] args) {
        //TEST CLASS

        Resolution resolution=new Resolution(1920,1080);
        Monitor monitor=new Monitor("VS197DE","ASUS","18.5",resolution);

        Kasa kasa=new Kasa("SHADOW BLADE","SHADOW","Temperli Cam");

        Anakart anakart=new Anakart("B250-PRO","ASUS",10,"WINDOWS 10");

        Bilgisayar bilgisayar=new Bilgisayar(monitor,kasa,anakart);


        //bilgisayar nesnesindeki getMonitor metodu  Monitor Class'ının obje referansını donuyor.
        //Bu sayede Monıtor Class'ının metoduna erisim saglandi.
        bilgisayar.getMonitor().monitoru_kapat();

        //has-a iliskisi var--> bilgisayarın parcaları(her bir class bir parcadır tek basına bilgisayar olamaz)
        System.out.println(bilgisayar.getMonitor().getResolution().getBoy());


    }
}