import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanicidan alinan 3 sayidan maksimum olani bulma
        Scanner sc=new Scanner(System.in);
        String mesaj="Lutfen bir sayi giriniz: ";
        System.out.print(mesaj);
        int s1=sc.nextInt();

        System.out.print(mesaj);
        int s2=sc.nextInt();

        System.out.print(mesaj);
        int s3=sc.nextInt();

        int maks=-1;
        if( (s1 >= s2) && (s1 >= s3))
            maks=s1;
        else if((s2 >=s1 )&&( s2 >= s3))
            maks=s2;
        else
            maks=s3;

        System.out.println("En buyuk sayi:"+maks);
    }
}