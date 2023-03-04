//Реализовать простой калькулятор (+ - / *)
//Ввод числа ->
//Ввод знака ->
//Ввод числа ->

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите знак операции: ");
        char op = scanner.next().charAt(0);
        String res;
        int c;
        switch (op) {
            case '+':
                c = a + b;
                res = a + "+" + b + "=" + c;
                System.out.println(res);
                break;
            case '-':
                c = a - b;
                res = a + "-" + b + "=" + c;
                System.out.println(res);
                break;
            case '*':
                c = a * b;
                res = a + "*" + b + "=" + c;
                System.out.println(res);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Деление на ноль невозможно!");
                    break;
                }
                c = a / b;
                res = a + "/" + b + "=" + c;
                System.out.println(res);

                scanner.close();
        }
    }
}