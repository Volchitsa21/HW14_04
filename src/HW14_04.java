import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HW14_04 {
    public static void main(String[] args) {
        long timeBefore, timeAfter;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        arrayList.clear();
        System.out.println("Starting...");
        timeBefore = System.currentTimeMillis();
        addToStart(arrayList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method addToStartArrayList took - " + (timeAfter - timeBefore));

        linkedList.clear();
        timeBefore = System.currentTimeMillis();
        addToStart(linkedList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method addToStartLinkedList took - " + (timeAfter - timeBefore));

        arrayList.clear();
        timeBefore = System.currentTimeMillis();
        addToMid(arrayList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method addToMidArrayList took - " + (timeAfter - timeBefore));

        linkedList.clear();
        timeBefore = System.currentTimeMillis();
        addToMid(linkedList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method addToMidLinkedList took - " + (timeAfter - timeBefore));

        arrayList.clear();
        timeBefore = System.currentTimeMillis();
        addToEnd(arrayList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method addToEndArrayList took - " + (timeAfter - timeBefore));

        arrayList.clear();
        timeBefore = System.currentTimeMillis();
        deleteToStart(arrayList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method deleteToStartArrayList took - " + (timeAfter - timeBefore));

        linkedList.clear();
        timeBefore = System.currentTimeMillis();
        addToEnd(arrayList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method addToEndLinkedList took - " + (timeAfter - timeBefore));

        linkedList.clear();
        timeBefore = System.currentTimeMillis();
        deleteToStart(arrayList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method deleteToStartLinkedList took - " + (timeAfter - timeBefore));

        arrayList.clear();
        timeBefore = System.currentTimeMillis();
        deleteToMid(arrayList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method deleteToMidArrayList took - " + (timeAfter - timeBefore));

        linkedList.clear();
        timeBefore = System.currentTimeMillis();
        deleteToMid(arrayList);
        timeAfter = System.currentTimeMillis();
        System.out.println("Method deleteToMidLinkedList took - " + (timeAfter - timeBefore));
    }

    public static void addToStart(List<Integer> list) {
        for (int i = 0; i <= 100_000; i++) {
            list.add(0, i);
        }
    }

    public static void addToMid(List<Integer> list) {
        for (int i = 0; i <= 100_000; i++) {
            int mid = list.size() != 0 ? list.size() / 2 : 0;
            list.add(mid, i);
        }
    }


    public static void addToEnd(List<Integer>list) {
        for (int i = 0; i <= 100_000; i++) {
            list.add(i);
        }
    }



    public static void deleteToStart(List<Integer>list) {
        for (int i = 0; i <= 100_000; i++) {
            if (list.size() > 0) {
                list.remove(0);
            }
        }
    }


    public static void deleteToMidArrayList(List<Integer> list) {
        for (int i = 0; i <= 100_000; i++) {
            int mid = list.size() != 0 ? list.size() / 2 : 0;
            if (list.size() > 0) {
                list.remove(mid);
            }
        }
    }

    public static void deleteToMid(List<Integer> list) {
        for (int i = 0; i <= 100_000; i++) {
            int mid = list.size() != 0 ? list.size() / 2 : 0;
            if (list.size() > 0) {
                list.remove(mid);
            }
        }
    }

}
