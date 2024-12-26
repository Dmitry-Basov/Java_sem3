// import java.util.ArrayList;

// public class obj {

//     public static void main(String[] args) {
//         ArrayList<Object> list = new ArrayList<>();
//         list.add("string");
//         list.add(42);
//         list.add(true);

//         for(Object obj : list){
//             System.out.println("элемент: " + obj + ", Тип: " + obj.getClass());
//         }
//     }
// }

public class obj {

    public static void main(String[] args) {
        Object obj = "Hello, World!";
        if(obj instanceof String){
            String str = (String) obj;
            System.out.println(("Строка: " + str));
        }
    }
}