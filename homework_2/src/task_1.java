import java.io.FileWriter;
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 41, 20, 3, 56, 4, 5, 7, 8, 10, 30, 2, 1};
        int temp;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    writeArr(arr, "Шаг " + count + ": ");
                    count++;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void writeArr(int[] arr, String str) {
        try {
            FileWriter file = new FileWriter("homework_2\\src\\log_1.txt",
                    true);
            file.write(str + Arrays.toString(arr) + "\n");
            file.close();

        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}
