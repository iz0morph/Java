import java.io.FileWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) throws Exception {
        Deque<Integer> results = new ArrayDeque<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        results.push(a);
        calc(results);
    }

    public static void calc(Deque<Integer> results) throws Exception {
        int c;
        String res;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите знак операции: ");
            String op = scanner.next();
            if (op.equals("stop")) {
                break;
            } else if (op.equals("отмена")) {
                results.pop();
                System.out.println(results.getFirst());
                continue;
            }
            System.out.print("Введите второе число: ");
            int number = scanner.nextInt();
            switch (op) {
                case "+" -> {
                    c = results.getFirst() + number;
                    res = results.getFirst() + "+" + number + "=" + c;
                    results.push(c);
                    System.out.println("Результат: " + res);
                }
                case "-" -> {
                    c = results.getFirst() - number;
                    res = results.getFirst() + "-" + number + "=" + c;
                    results.push(c);
                    System.out.println("Результат: " + res);
                }
                case "*" -> {
                    c = results.getFirst() * number;
                    res = results.getFirst() + "*" + number + "=" + c;
                    results.push(c);
                    System.out.println("Результат: " + res);
                }
                case "/" -> {
                    if (number == 0) {
                        System.out.println("Деление на ноль невозможно!");
                        break;
                    }
                    c = results.getFirst() / number;
                    res = results.getFirst() + "/" + number + "=" + c;
                    results.push(c);
                    System.out.println("Результат: " + res);
                }
            }
        }
        scanner.close();
    }
}

