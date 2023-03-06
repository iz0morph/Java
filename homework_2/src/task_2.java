
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) throws Exception {
        String path = "homework_2\\src\\students.txt";
        String[] data = parse(path);
        System.out.println(strBuild(data));
    }

    public static String[] parse(String path) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        int count = 0;
        while (reader.readLine() != null) {
            count++;
        }
        reader.close();
        String[] student = new String[count];
        int index = 0;
        BufferedReader reader_2 = new BufferedReader(new FileReader(path));
        while (index < student.length) {
            student[index] = reader_2.readLine().replace(":", ",").replace(
                    "\"", "");
            index++;
        }
        reader_2.close();
        return student;
    }

    public static StringBuilder strBuild(String[] students) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            String[] data = students[i].split(",");
            str.append("Студент " + data[1] + " получил " + data[3] + " по " +
                    "предмету " + data[5] + "\n");
        }
        return str;
    }
}
