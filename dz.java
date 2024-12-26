import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class dz {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for(int i = 0; i<10;i++){
            list.add(random.nextInt(100));
        }
        deleteNum(list);
        minNum(list);
        maxNum(list);
        Collections.sort(list);
        System.out.println("Список после удаления четных чисел"+list);

        if(!list.isEmpty()){
            int min = minNum(list);
            System.out.println("Минимальное значение в списке: "+ min);

            int max = maxNum(list);
            System.out.println("Максимальное число в списке: "+ max);

            double avg = findAverage(list);
            System.out.println("Среднее значение в списке: "+ avg);
        }else{
            System.out.println("список пуст");
        }
    }

    public static int maxNum(ArrayList<Integer> list){
        int max = list.get(0);
        for(int n : list){
            if(n > max){
                max = n;
            }
        }
        return max;
    }


    public static int minNum(ArrayList<Integer> list){
        int min = list.get(0);
        for(int num:list){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(ArrayList<Integer> list){
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        return (double) sum/list.size();
    }


    public static void deleteNum(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if(num % 2 == 0){
                iterator.remove();
            }

            
        }
    }
}
