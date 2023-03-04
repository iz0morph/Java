//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n!
// (произведение чисел от 1 до n)

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Введите число: ");

        int n = value.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            fact *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d: %d, произведение: %d ", n, sum, fact);
        value.close();
    }
}
