import co.edu.uptc.model.ListUptc;
import co.edu.uptc.model.ListVector;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        /*
        List listVector = new ArrayList();
        System.out.println(listVector.size());
        for (int i = 0; i < 10; i++) {
            listVector.add("Value "+i);
        }
        listVector.add(5,"e");
        System.out.println(listVector.size());

        for (int i = 0; i < 10; i++) {
            System.out.println(listVector.get(i));
        }
        listVector.set(4,2);
        for (int i = 0; i < 10; i++) {
            System.out.println(listVector.get(i));
        }
         */

        ListUptc listUptc = new ListUptc();


        for (int i = 0; i < 10; i++) {
            listUptc.add("Value "+i);
        }
        System.out.println(listUptc.size());


        listUptc.add("Miercoles");
        listUptc.add("Jueves");
        listUptc.add("Viernes");

        listUptc.remove(11
        );

        try {
            for (int i = 0; i < 12; i++) {
                System.out.println(listUptc.get(i));
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        System.out.println(listUptc.size());


    }


    public void add(){

    }
}