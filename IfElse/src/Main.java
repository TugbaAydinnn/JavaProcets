import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     //IF-ELSE
        Scanner scanner=new Scanner(System.in); //Klavyeden giris almak icin
        System.out.print("Yasinizi giriniz: ");
        int yas=scanner.nextInt();

        if(yas<18){
            System.out.println("Askere gidemez");
        }else{
            System.out.println("Askere gidebilir.");
        }

    }
}