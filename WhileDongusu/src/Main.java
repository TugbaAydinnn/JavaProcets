import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int islem=1;
        double bakiye=1000;
        while (islem!=4){

            System.out.print("Lutfen bir islem seciniz: \n" +
                    "1- Bakiye Ogrenme \n" +
                    "2- Para Yatirma \n" +
                    "3- Para Cekme \n" +
                    "4- Cıkıs \n");
             islem=sc.nextInt();
             switch (islem){
                 case 1:
                     System.out.println("Bakiye: "+bakiye);
                     break;
                 case 2:
                     System.out.print("Hesaba yatirilacak para tutarini giriniz: ");
                     Double tutar=sc.nextDouble();
                     bakiye=bakiye+tutar;
                     System.out.println("Guncel Bakiye: "+bakiye);
                     break;
                 case 3:
                     System.out.print("Hesaptan cekilecek para tutarini giriniz: ");
                     double cekilecekTutar=sc.nextDouble();
                     bakiye=bakiye-cekilecekTutar;
                     System.out.println("Guncel Bakiye: "+bakiye);
                     break;
                 case 4:
                     System.out.println("Cıkıs yapiliyor..");
                     break;
                 default:
                     System.out.println("Hati giris.Lutfen tekrar deneyiz.");
             }

        }
    }
}