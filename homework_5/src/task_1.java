import java.util.*;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//Добавить функции 1) Добавление номера
//2) Вывод всего
public class task_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> data = new HashMap<>();
        Scanner newScanner = new Scanner(System.in);
        while (true) {
            System.out.println("1) Добавление номера;\n2) Вывод всего;");
            int func = newScanner.nextInt();
            if (func == 1) {
                System.out.println("Введите фамилию: ");
                String name = newScanner.next();
                System.out.println("Введите номер телефона: ");
                int phone_number = newScanner.nextInt();
                fillMap(name, phone_number, data);

            } else if (func == 2) {
                printMap(data);
            } else break;
        }
        newScanner.close();
    }

    public static void fillMap(String name, int phone_number, Map<String,
            ArrayList<Integer>> data) {
        if (data.get(name) == null) {
            ArrayList<Integer> phone_numbers = new ArrayList<>();
            phone_numbers.add(phone_number);
            data.put(name, phone_numbers);
        } else {
            ArrayList<Integer> phone_numbers = new ArrayList<>(data.get(name));
            phone_numbers.add(phone_number);
            data.put(name, phone_numbers);
        }
    }

    public static void printMap(Map<String,
            ArrayList<Integer>> data) {
        for (Map.Entry<String, ArrayList<Integer>> entry : data.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
