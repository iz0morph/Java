import java.util.*;

//Пусть дан список сотрудников:
//Иван Иванов
//Светлана Петрова
//Кристина Белова
//Анна Мусина
//Анна Крутова
//Иван Юрин
//Петр Лыков
//Павел Чернов
//Петр Чернышов
//Мария Федорова
//Марина Светлова
//Мария Савина
//Мария Рыкова
//Марина Лугова
//Анна Владимирова
//Иван Мечников
//Петр Петин
//Иван Ежов
//
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности Имени.
public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> staff = new ArrayList<>(Arrays.asList("Иван " +
                "Иванов", "Светлана Петрова", "Кристина Белова", "Анна " +
                "Мусина", "Мария Федорова", "Анна Крутова", "Иван " +
                "Юрин", "Петр Лыков", "Павел Чернов", "Петр " +
                "Чернышов", "Марина Светлова", "Мария Савина", "Мария " +
                "Рыкова", "Марина Лугова", "Анна Владимирова", "Иван " +
                "Мечников", "Петр Петин", "Иван Ежов"));
        for (int i = 0; i < staff.size(); i++) {
            staff.set(i, staff.get(i).split(" ")[0]);
        }
        staff.sort(Comparator.naturalOrder());
        int count = 1;
        String man = staff.get(0);
        Map<String, Integer> names = new HashMap<>();
        for (int i = 1; i < staff.size(); i++) {
            if (staff.get(i).equals(man)) {
                count++;
            } else {
                names.put(man, count);
                count = 1;
                man = staff.get(i);
            }
        }
        int max_count = 1;
        List<String> sorted_names = new ArrayList<>(names.keySet());
        String temp;
        for (int i = 0; i < sorted_names.size() - 1; i++) {
            for (int j = 0; j < sorted_names.size() - 1; j++) {
                if (names.get(sorted_names.get(j + 1)) > names.get(sorted_names.get(j))) {
                    temp = sorted_names.get(j);
                    sorted_names.set(j, sorted_names.get(j + 1));
                    sorted_names.set(j + 1, temp);
                }
            }
        }
        for (int i = 0; i < sorted_names.size(); i++) {
            System.out.println(sorted_names.get(i) + " - " + names.get(sorted_names.get(i)));
        }
    }
}
