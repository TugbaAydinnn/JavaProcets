import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Idman programina hosgeldiniz...\n" +
                "Gecerli Hareketler...\n" +
                "Burpee\n" +
                "PushUp\n" +
                "sitUp\n" +
                "squat\n" +
                "Bir idman olusturun...");
        System.out.print("Burpee Sayisi:");
        int burpee=sc.nextInt();

        System.out.print("PushUp Sayisi:");
        int pushUp=sc.nextInt();

        System.out.print("SitUp Sayisi:");
        int sitUp=sc.nextInt();

        System.out.print("Squat Sayisi:");
        int squat=sc.nextInt();

        sc.nextLine();//int-->string geçisi oldugu icin

        Idman idman=new Idman(burpee,pushUp,sitUp,squat);
        while (!idman.idmanBittiMi()){
            System.out.println("Harket turu (burpee,pushUp,sitUp,squat)");
            String tur=sc.nextLine();
            System.out.println("Hareket sayisini giriniz:");
            int sayi=sc.nextInt();
            sc.nextLine(); //string'ten sonra int veri girisi yaptıgimiz icin


            idman.hareketYap(tur, sayi);
        }


    }
}