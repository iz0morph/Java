//Вывести все простые числа от 1 до 1000
public class task_2 {
    public static void main(String[] args) {
        int count = 2;
        for (int number = 2; number <= 1000; number++) {
            for (int del = 2; del * del <= number; del++) {
                if (number % del == 0) {
                    count = 3;
                    break;
                }
            }
            if (count == 2) System.out.println(number);
            count = 2;

        }
    }
}
