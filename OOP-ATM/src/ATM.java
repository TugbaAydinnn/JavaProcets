import java.util.Scanner;

public class ATM {
    Scanner sc=new Scanner(System.in);
    public void calis(Hesap hesap){

        int girisHakki=3;
        Login login=new Login();
        System.out.println("Bankamiza Hosgeldiniz");
        System.out.println("********************************");
        System.out.println("Kullanici Girisi:");
        System.out.println("*********************************");

        while (girisHakki>0){
            if (login.login(hesap)){
                System.out.println("ıslem basarili");
                System.out.println("*********************************");
                System.out.println("Lutfen ıslem seciniz:\n" +
                        "1:Para Goruntuleme\n" +
                        "2:Para Yatirma\n" +
                        "3: Para Cekme \n" +
                        "4: Cikis \n");
                int islem=sc.nextInt();
                islemSec(islem,hesap);
            }
            else{
                girisHakki-=1;
                System.out.println("Tekrar deneyiniz.Kalan giris hakki: "+girisHakki);

            }

            if(girisHakki==0){
                System.out.println("Giriş hakkiniz bitti");
                return; //metodun sonlandirilmasi icin

            }

        }


    }
    public void islemSec(int islem,Hesap hesap){
        while (islem!=4){


            if (islem==1){
                System.out.println("Bakiyeniz:  "+hesap.getBakiye());
            }
            else if (islem==2){
                System.out.print("Yatiracaginiz para miktari: ");
                double miktar=sc.nextDouble();
                hesap.paraYatirma(miktar);
            }else if(islem==3){
                System.out.print("Cekeceginiz para miktari: ");
                double miktar=sc.nextDouble();
                hesap.paraYatirma(miktar);
            } else if (islem==4) {
                break;
            }else{
                System.out.println("Hatali secim...");
            }

            System.out.println("Lutfen ıslem seciniz:\n" +
                    "1:Para Goruntuleme\n" +
                    "2:Para Yatirma\n" +
                    "3: Para Cekme \n" +
                    "4: Cikis \n");
            islem=sc.nextInt();
        }

    }
}
