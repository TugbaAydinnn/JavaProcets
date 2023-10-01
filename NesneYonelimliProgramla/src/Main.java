public class Main {
    public static void main(String[] args) {
        //Araba araba=new Araba();

        //araba.setTekerSayisi(-4);
        //System.out.println(araba.getTekerSayisi());


        Araba.sayac=2;
        System.out.println(Araba.sayac);

        System.out.println("**************");

        Araba araba2=new Araba(4,"Golf",5,"kirmizi");
        araba2.arabaOzellikYazdir();

        System.out.println("**************");
        Araba araba3=new Araba();
        araba3.arabaOzellikYazdir();

        System.out.println("**************");
        Araba araba4=araba3;
        araba4.setTekerSayisi(5);
        araba4.arabaOzellikYazdir();

        System.out.println("**************");
        araba3.arabaOzellikYazdir();

        System.out.println("**************");

        if(araba4 == araba3)
            System.out.println("Aynı objeyi gosteriyor.");
        if(araba4 != araba2)
            System.out.println("Aynı objeyi gostermiyorlar.");

        new Araba(0,"Opel",5,"Mavi").arabaOzellikYazdir(); //referans olmadan bir kereligine metod cagirabilirsin.

    }
}