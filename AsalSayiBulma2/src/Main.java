public class Main {
    public static void main(String[] args) {
        for(int i=2;i<=1000;i++){
            if(asalSayiMi(i)){
                System.out.println(i+" asal sayidir.");
            }
        }
    }

    public static Boolean asalSayiMi(int sayi){
        for(int i=2;i<sayi;i++){
            if(sayi%i==0)
                return false;
        }
        return true;

    }

}