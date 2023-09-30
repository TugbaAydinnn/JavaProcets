import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mesaj="Bir sayi giriniz: ";
        Scanner sc=new Scanner(System.in);
        int s1,s2;
        System.out.print(mesaj);
        s1=sc.nextInt();
        System.out.print(mesaj);
        s2=sc.nextInt();

        ebobBul(s1,s2);
    }
    public static void ebobBul(int s1, int s2){
        int min=0,i=2;
        int ebob=1;
        if(s1<s2)
            min=s1;
        else
            min=s2;

        while(i<=min){
            if( (s1%i)==0 && (s2%i==0) ){
                ebob*=i;
                s1=s1/i;
                s2=s2/i;
                i=1;
            }
            i++;

        }
        System.out.println("EBOB: "+ebob);

    }
}