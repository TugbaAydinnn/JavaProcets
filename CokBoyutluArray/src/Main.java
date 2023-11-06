import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] [] array;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen cok boyutlu dizinin satır sayisini giriniz: ");
        int satirSayisi=scanner.nextInt();

        System.out.print("Lutfen cok boyutlu dizinin sutun sayisini giriniz: ");
        int sutunSayisi=scanner.nextInt();
        array=cokBoyutluArrayOlustur(satirSayisi,sutunSayisi,scanner);

        diziYazdir(array,satirSayisi,sutunSayisi);
    }
    public static int[][] cokBoyutluArrayOlustur(int satirSayisi, int sutunSayisi, Scanner scanner){
        int[][] array=new int [satirSayisi][sutunSayisi];
        for(int j=0;j<sutunSayisi;j++) {

            for (int i = 0; i < satirSayisi; i++) {
                System.out.println("Lutfen "+j+". sutun " + i + ". satir elemanlarini giriniz: ");
                int sayi = scanner.nextInt();
                array[i][j] = sayi;

            }
        }
        return  array;
    }
    public static void diziYazdir(int[][] array,int satirSayisi,int sutunSayisi){
        System.out.println("-----Dizinin elemanları-----");
        for (int i=0;i<sutunSayisi;i++){
            for (int j=0;j<satirSayisi;j++){
                System.out.print(array[j][i]);
            }
            System.out.print("\n");
        }
    }
}