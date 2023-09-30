import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Break

        int i=0;
        while (i<20){
            if (i==2)
                break;
            System.out.println("i= "+i);
            i++;
        }

        Scanner sc=new Scanner(System.in);
         while (true){
             int islem=sc.nextInt();
             if (islem==-1){
                 System.out.println("Donguden cikiliyor...");
                 break;
             }
             System.out.println("sayi giriniz:");
         }

         //Continue
        int sayac=0;
        while(sayac<20){
            if (sayac==2){
                sayac++; //sonsuz donguye girebilirdi.
                continue;
            }
            System.out.println("sayac= "+sayac);
            sayac++;
        }





    }
}