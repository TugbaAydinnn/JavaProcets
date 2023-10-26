import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] array;
        System.out.print("Dizinin Boyutunu Giriniz: ");
        int boyut=sc.nextInt();
        array=arrayElementAdd(boyut);
        arrayWrite(array);

        System.out.println("-----------");;
        arrayWrite(arraySort(array));



    }
    public static int[] arrayElementAdd(int boyut){
        int[] array=new int[boyut];
        for (int i=0;i<boyut;i++){
            System.out.print("Dizinin "+(i+1)+". Elamanını giriniz: ");
            array[i]=  sc.nextInt();
        }
        return array;
    }
    public static void arrayWrite(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Dizinin "+(i+1)+". Elemanı--->"+array[i]);
        }

    }

    public static int[] arraySort(int[] array){
        return Arrays.stream(array).sorted().toArray();

    }
}