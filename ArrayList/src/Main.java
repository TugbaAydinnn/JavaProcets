import java.util.ArrayList;

public class Main {
    public static void yazdir(ArrayList<String> arrayList){
        for (String eleman:arrayList){
            System.out.println(eleman);
        }

    }
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Cilek");
        arrayList.add("Elma");
        arrayList.add("Kavun");
        arrayList.add("Cilek");
        arrayList.add("Karpuz");
        yazdir(arrayList);

        System.out.println(arrayList.indexOf("Cilek"));
        System.out.println(arrayList.lastIndexOf("Cilek"));

        arrayList.remove(3);
        System.out.println("Arraylist'in Boyu: "+arrayList.size());




    }
}