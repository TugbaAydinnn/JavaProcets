import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //switch-case
        System.out.print("Lutfen asagida yer alan islemlerden birisini seciniz: \n" +
                "1: Toplama \n" +
                "2: Cikartma \n" +
                "3: Bolme \n" +
                "4: Carpma \n");
        Scanner sc=new Scanner(System.in);
        int islem=sc.nextInt();
        switch(islem){
            case 1:
                System.out.println("Toplama islemini sectiniz ---> 3+2=5");
                break; //break yazilmadigi durumda kosul saglanan case' ye girdigi zaman alt tarafta yer alan case'lere de girer.
            case 2:
                System.out.println("Cikartma islemini sectiniz ---> 3-2=1");
                break;
            case 3:
                System.out.println("Bolme islemini sectiniz ---> 3-2=1.5");
                break;
            case 4:
                System.out.println("Carpma islemini sectiniz ---> 3*2=6");
                break;
            default:
                System.out.println("hatali islem");
                break;
        }
    }
}