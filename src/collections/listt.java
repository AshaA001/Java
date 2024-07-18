package collections;

import java.util.*;

public class listt {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(34);
        set.add(-1);
        set.add(90);
        set.add(21);
        set.add(-5);
        set.add(-1);
        set.add(104);

        List l = new ArrayList<>();
        l.addAll(set);
        System.out.println(l.toString());

        Collections.sort(l);

        System.out.println("Sorted: " + l.toString());

        Collections.shuffle(l);
        System.out.println("Shuffled: " + l.toString());

        int i = Collections.binarySearch(l,90);
        System.out.println("Index: " + i);

        int j = Collections.binarySearch(l,9000);
        if(j<0) {
            System.out.println("item not present");
        }

        List<Integer> li = Arrays.asList(1,4,6,7,8,230,234,356);
        int[] arr = new int[]{1,234,356,67,78,3452,234};
        Arrays.sort(arr);
        System.out.println("Sorted arr: " + Arrays.toString(arr));
    }
}
