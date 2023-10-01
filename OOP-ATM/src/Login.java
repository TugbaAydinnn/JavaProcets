import java.util.Scanner;

public class Login {
    String kullaniciAdi;
    String parola;

    public boolean login(Hesap hesap){
        Scanner sc=new Scanner(System.in);
        System.out.print("Kullanici adini giriniz: ");
        kullaniciAdi=sc.nextLine();
        System.out.print("Parolanizi giriniz: ");
        parola=sc.nextLine();

        String hesap_Kullaniciadi=hesap.getKullaniciAdi();
        String hesap_sifre=hesap.getParola();
        if( (hesap_Kullaniciadi.equals(kullaniciAdi)) &&(hesap_sifre.equals(parola)) )
            return true;
        else
            return false;
    }
}
