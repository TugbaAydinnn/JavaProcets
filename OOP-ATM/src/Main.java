public class Main {
    public static void main(String[] args) {
        Hesap hesap=new Hesap(1000.0,"12344","Admin","1");

        ATM atm=new ATM();
        atm.calis(hesap);
        System.out.println("Programdan cikiliyor..");
    }
}