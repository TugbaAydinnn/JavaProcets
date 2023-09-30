import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ana para degerini giriniz: ");
        double anaPara=sc.nextDouble();

        System.out.print("Kac yil vadeli yatirmak istiyorsunuz: ");
        int vadeYili=sc.nextInt();

        int i=1;
        while(i<=vadeYili){
            anaPara+=(anaPara*6/100);
            System.out.println(i+" . yilin sonundaki para miktariniz:  "+(int)anaPara);
            i++;
        }
    }
}