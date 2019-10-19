package collections.optionalTask;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(78); list.add(-100); list.add(1); list.add(1342); list.add(-967423);
        list.add(213); list.add(-100); list.add(23); list.add(367); list.add(-23452);
        list.add(46); list.add(1); list.add(54); list.add(34533); list.add(-5783);
        list.add(2134); list.add(-1030); list.add(23); list.add(367); list.add(-34);

        System.out.println("Original list: ");
        System.out.println(list);
        System.out.println("Semi-sorted list: ");
        int indexOfSeparatorCountingFromTheEnd = 0;
        for (int i = 0; i < list.size()-indexOfSeparatorCountingFromTheEnd; i++) {
            if (list.get(i) < 0) {
                list.add(list.get(i));
                list.remove(i);
                i--;
                indexOfSeparatorCountingFromTheEnd++;
            }
        }
        System.out.println(list);
    }
}
