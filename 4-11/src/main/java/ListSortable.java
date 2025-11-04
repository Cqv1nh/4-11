import java.util.ArrayList;
import java.util.List;

public class ListSortable <E extends Comparable<E>> {
    private List<E> list = new ArrayList<>();

    public ListSortable() {
        this.list = list;
    }

    public void add(E e) {
        list.add(e);
    }

    public void print() {
        for (int i = 1; i < list.size(); i++) {

            E key = list.get(i);
            int j;

            for (j = i - 1; j >= 0; j--) {
                if (list.get(j).compareTo(key) <= 0) {
                    break;
                }

                list.set(j + 1, list.get(j));
            }
            list.set(j + 1, key);
        }

        for (E element : list) {
            System.out.println(element);
        }
    }


}
