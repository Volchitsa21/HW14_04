import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListIntr {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        System.out.println(list);
        System.out.println(list.add(10));
        list.add(0, 22);
        System.out.println(list);
        int x = list.get(1);
        System.out.println(x);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        System.out.println("Add all: " + list.addAll(temp));
        System.out.println(list);
        System.out.println("Add all by index: " + list.addAll(0, temp));
        System.out.println(list);
        System.out.println("Remove by object 22:" + list.remove((Integer) 22));
        System.out.println("Contains 22: "+list.contains(22));
        System.out.println(list.remove(0));
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("Remove All: " + list.removeAll(temp));
        System.out.println(list);
        list.addAll(temp);
        System.out.println(list);
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t%2==0;
            }
        });
        System.out.println(list);
        System.out.println("Old element = " + list.set(1, 10));
        System.out.println(list);
        list.addAll(temp);
        System.out.println(list);
        System.out.println("Index of number 1: " + list.indexOf(1));
        System.out.println("Last Index of number 1: " + list.lastIndexOf(1));
        System.out.println(list.indexOf(123));

        System.out.println("Index of number 2: " + list.indexOf(2));
        System.out.println("Last Index of number 2: " + list.lastIndexOf(2));
    }

}
