public class Main {
    public static void main(String[] args) {

        String[] array={"Elma","Armut","Cilek"};
        /*
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }*/
        for(String eleman:array){
            System.out.println(eleman);
        }

        int[][] array2={{1,2},{3,4}};
        for (int[] satir: array2){
            for(int sutun:satir){
                System.out.print(sutun);
            }
            System.out.println("");
        }



        Test[] test={new Test ("Ayşe"), new Test("Fatma")};

        for (Test t :test){
            t.yaz();
        }

    }
}