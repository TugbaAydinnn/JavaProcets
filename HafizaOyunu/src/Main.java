import java.util.Scanner;

public class Main {
    public static Kart[][] kartlar=new Kart[4][4];
    public static void main(String[] args) {

        kartlar[0][0]=new Kart('E');
        kartlar[0][1]=new Kart('A');
        kartlar[0][2]=new Kart('B');
        kartlar[0][3]=new Kart('F');

        kartlar[1][0]=new Kart('G');
        kartlar[1][1]=new Kart('A');
        kartlar[1][2]=new Kart('D');
        kartlar[1][3]=new Kart('H');

        kartlar[2][0]=new Kart('F');
        kartlar[2][1]=new Kart('C');
        kartlar[2][2]=new Kart('D');
        kartlar[2][3]=new Kart('H');

        kartlar[3][0]=new Kart('E');
        kartlar[3][1]=new Kart('G');
        kartlar[3][2]=new Kart('B');
        kartlar[3][3]=new Kart('C');

        while (!oyunBittiMi()){
            oyunTahtasi();
            tahtinEt();
        }
    }
    public static void tahtinEt(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tahmin (i ve j degerlerini bir boslukla giriniz)");
        int i1= sc.nextInt();;
        int j1=sc.nextInt();
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();

        System.out.print("İkinci tahmin (i ve j degerlerini bir boslukla giriniz)");
        int i2= sc.nextInt();;
        int j2=sc.nextInt();
        kartlar[i2][j2].setTahmin(true);
        oyunTahtasi();

        if(kartlar[i1][j1].getDeger()==kartlar[i2][j2].getDeger()){
            System.out.println("Doğru Tahmin");
            kartlar[i1][j1].setTahmin(true);
            kartlar[i2][j2].setTahmin(true);
        }else{
            System.out.println("Yanlış  Tahmin");
            kartlar[i2][j2].setTahmin(true);
            oyunTahtasi();
            kartlar[i1][j1].setTahmin(false);
            kartlar[i2][j2].setTahmin(false);
            System.out.println("*************");
        }
    }
    public static boolean oyunBittiMi(){
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin()==false)
                    return false;
            }
        }
        return true;
    }

    public static void oyunTahtasi(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" |"+kartlar[i][j].getDeger()+"| ");

                }
                else {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
    }
}