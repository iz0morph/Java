import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("sad", "dadef",
                "asdef", "5687"));
        System.out.println(ll);
        System.out.println(reverseList(ll));
    }

    public static Deque<String> reverseList(LinkedList<String> ll) {
        Deque<String> revList = new ArrayDeque<>();
        for (String str : ll) {
            revList.push(str);
        }
        return revList;
    }
}
