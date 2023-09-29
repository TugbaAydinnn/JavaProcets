import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Vize1 notonuzu giriniz: ");
        int vize1=sc.nextInt();

        System.out.print("Vize2 notunu giriniz: ");
        int vize2=sc.nextInt();

        System.out.print("Final notunu giriniz: ");
        int finalNotu=sc.nextInt();

        System.out.print("Lutfen genel ortalamanizi giriniz: ");
        double genelOrt=sc.nextDouble();

        double toplamNot=(vize1*30/100)+(vize2*30/100)+(finalNotu*40/100);
        String harfNotu="";
        if(toplamNot>=90)
            harfNotu="AA";
        else if(toplamNot>=85)
            harfNotu="BA";
        else if(toplamNot>=80)
            harfNotu="BB";
        else if(toplamNot>=75)
            harfNotu="CB";
        else if(toplamNot>=70)
            harfNotu="CC";
        else if(toplamNot>=65)
            harfNotu="DC";
        else if(toplamNot>=60)
            harfNotu="DD";
        else if(toplamNot>=55)
            harfNotu="DC";
        else
            harfNotu="FF";

        System.out.println("Harf Notunuz: "+harfNotu);
        if(genelOrt<2.50 && harfNotu.equals("DD"))
            System.out.println("DD aldınız ve not ortalamaniz dusuk.Bu dersi tekrar almayi dusunebilirsiniz");


    }
}