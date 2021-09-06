import java.util.ArrayList;

public class JavaApplication15 {


    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(2);
        list.add(3.6);

        for (Number number: list){
            System.out.println(number);
        }

        ArrayList<ArrayList<Number>> bigList = new ArrayList<>();
        bigList.add(list);
        bigList.get(0).add(10);
        bigList.add(new ArrayList<>());
        bigList.get(1).add(11);


        for (ArrayList<Number> arrayList : bigList){
            for(Number number: arrayList){
                System.out.println(number + " ");
            }

            System.out.println();
        }

        ArrayList<Comparable<Double>> cList = new ArrayList<>();

        cList.add(10.0);
        cList.add(2.5);

        if(cList.get(0).compareTo((Double) cList.get(1))>0) System.out.println("Ok");

    }

}
