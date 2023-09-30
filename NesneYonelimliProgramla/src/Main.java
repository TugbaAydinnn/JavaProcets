public class Main {
    public static void main(String[] args) {
        //Araba araba=new Araba();

        //araba.setTekerSayisi(-4);
        //System.out.println(araba.getTekerSayisi());


        Araba.sayac=2;
        System.out.println(Araba.sayac);

        Araba araba2=new Araba(4,"Golf",5,"kirmizi");
        araba2.arabaOzellikYazdir();


    }
}