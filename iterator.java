import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        // создание списка
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("cherry");

        // получение итератора
        Iterator<String> iterator = list.iterator();

        // перебо элементов с помощью итератора
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("Элемент: " + element);

            // удаление элемента banana
            if(element.equals("Banana")){
                iterator.remove();
            }
        }
        // печать оставшихся элементов списка
        System.out.println(("Оставшиеся элементы: "+ list));

    }
}
