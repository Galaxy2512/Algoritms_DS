package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LLandAL {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime;
        long endTime;
        long duration;

        for(int i = 0; i < 100000; i++){
            linkedList.add(i);
            arrayList.add(i);

        }
        startTime = System.nanoTime();
        linkedList.add(50000, 5);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: " + duration);


        startTime = System.nanoTime();
        arrayList.add(50000, 5);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList: " + duration);



    }


}
