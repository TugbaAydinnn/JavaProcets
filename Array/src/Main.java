import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int boyut=scanner.nextInt();

        int[] array=new int[boyut];
        for (int i=0;i<boyut;i++){
            System.out.print("Dizinin "+(i+1)+". Elemanını Giriniz: ");
            array[i]=scanner.nextInt();
            System.out.print("");
        }


        System.out.println("Dizinin Uzunluğu: "+array.length);
        arrayWrite(array);
        System.out.println("Dizinin Ortalaması: "+arrayOrt(array));
    }
    public  static void arrayWrite(int[] dizi){

        for(int i=0;i<dizi.length;i++){
            System.out.println(dizi[i]);
        }

    }
    public static Double arrayOrt(int[] dizi){
        int toplam=0;
        double ort=0;
        for (int i=0;i<dizi.length;i++){
            toplam+=dizi[i];
        }
        ort=(double) toplam/dizi.length;
        return ort;
    }
}