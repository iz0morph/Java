import java.util.*;

public class task {
    public static void main(String[] args) {
        Notebook nb_1 = new Notebook("Acer", "Ultra", 16, 1000, "windows",
                "silver");
        Notebook nb_2 = new Notebook("Asus", "MD-200", 8, 2000, "windows",
                "red");
        Notebook nb_3 = new Notebook("HP", "ID840", 4, 500, "linux",
                "black");
        Notebook nb_4 = new Notebook("Huawei", "Quanchong", 16, 1000, "macos",
                "blue");
        Notebook nb_5 = new Notebook("Asus", "KD200", 32, 2000, "windows",
                "silver");
        Notebook nb_6 = new Notebook("Lenovo", "Vivobook-16", 16, 500,
                "windows", "black");
        Notebook nb_7 = new Notebook("Acer", "Jh-80", 4, 2000, "windows",
                "silver");
        HashSet<Notebook> notebooks = new HashSet<>(Arrays.asList(nb_1, nb_2,
                nb_3, nb_4, nb_5, nb_6, nb_7));
        System.out.println("Добро пожаловать! Сейчас мы вам подберем модель " +
                "ноутбука!");
        printRes(filter(notebooks));
    }

    public static HashMap<String, HashSet<Notebook>> filter(HashSet<Notebook> notebooks) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, HashSet<Notebook>> criterions = new HashMap<>();
        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n" +
                    "0 - Закончить ввод фильтров");
            int criterion = scan.nextInt();
            if (criterion == 1) {
                System.out.println("Введите минимальный объем ОЗУ (ГБ):");
                int ram_amoint = scan.nextInt();
                HashSet<Notebook> ram_filter = new HashSet<>();
                for (Notebook nb : notebooks) {
                    if (nb.getRam() >= ram_amoint) {
                        ram_filter.add(nb);
                    }
                }
                criterions.put("ram", ram_filter);
            } else if (criterion == 2) {
                System.out.println("Введите минимальный объем HDD (ГБ):");
                int hdd_amoint = scan.nextInt();
                HashSet<Notebook> hdd_filter = new HashSet<>();
                for (Notebook nb : notebooks) {
                    if (nb.getHdd() >= hdd_amoint) {
                        hdd_filter.add(nb);
                    }
                }
                criterions.put("hdd", hdd_filter);
            } else if (criterion == 3) {
                System.out.println("Введите предпочитаемую ОС:");
                String os = scan.next();
                HashSet<Notebook> os_filter = new HashSet<>();
                for (Notebook nb : notebooks) {
                    if (nb.getOs().contains(os.toLowerCase())) {
                        os_filter.add(nb);
                    }
                }
                criterions.put("os", os_filter);
            } else if (criterion == 4) {
                System.out.println("Введите предпочитаемый цвет:");
                String color = scan.next();
                HashSet<Notebook> color_filter = new HashSet<>();
                for (Notebook nb : notebooks) {
                    if (nb.getColor().equals(color.toLowerCase())) {
                        color_filter.add(nb);
                    }
                }
                criterions.put("color", color_filter);
            } else break;
        }
        return criterions;
    }

    public static void printRes(HashMap<String, HashSet<Notebook>> criterions) {
        Set<Notebook> res = new HashSet<>();
        int i = 0;
        for (Map.Entry<String, HashSet<Notebook>> entry : criterions.entrySet()) {
            if (i == 0) {
                res.addAll(entry.getValue());
                i++;
            } else res.retainAll(entry.getValue());
        }
        if (!res.isEmpty()) {
            System.out.println("Под ваши критерии подходят следующие модели:");
            for (Notebook nb : res) {
                System.out.println(nb);
            }
        } else {
            System.out.println("Под ваши критерии ничего не подходит или вы " +
                    "не задали фильтры" +
                    "!");
        }
    }
}
