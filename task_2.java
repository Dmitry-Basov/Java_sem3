import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(100));
        }

        // Collections.sort(list);
        // Предреализованный метод обратной сортировки 
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
