
//Пусть дан произвольный список целых чисел, удалить из него чётные числа


import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,6,80,2,11,17,50,53,48,47,0,2));
        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index)%2==0){
                numbers.remove(index);
                index--;
            }
        }
        System.out.println(numbers);
    }
}
