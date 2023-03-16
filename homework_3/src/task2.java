//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 66, -50, 80, 2, 11, 17));
        int maxNumber = numbers.get(0);
        int minNumber = numbers.get(0);
        double summ = 0;

        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) > maxNumber) {
                maxNumber = numbers.get(index);
            }
            if (numbers.get(index) < minNumber) {
                minNumber = numbers.get(index);
            }
            summ += numbers.get(index);
        }
        double average = (summ / numbers.size());
        average=average*100;
        average=Math.round(average);
        average=average/100;
        
        System.out.println("Max number: " + maxNumber + "\n" + "Min number: "
                + minNumber + "\n" + "Average: " + average);
    }
}
