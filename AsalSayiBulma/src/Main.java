public class Main {
    public static void main(String[] args) {
      asalMi();
    }


    public static void asalMi(){
        int j=2;
        for(int i=2;i<=1000;i++){
            if(i==2)
                System.out.println("2 Asal sayi");
            else{
                while (i>j){
                    if(i%j==0){

                        System.out.println(i+" Asal Sayi değil");
                        break;
                    }
                    else{
                        if(i-j==1)
                            System.out.println(i+" Asal Sayi ");

                    }
                    j++;
                }
                j=2;

            }
        }
    }
}