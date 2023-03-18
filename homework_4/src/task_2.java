import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        enqueue(ll, "dwfr");
        enqueue(ll, "rewfre");
        enqueue(ll, "qwe");
        enqueue(ll, "5987");
        System.out.println(ll);
        System.out.println(first(ll));
        System.out.println(dequeue(ll));
        System.out.println(ll);
        System.out.println(dequeue(ll));
        System.out.println(ll);
        System.out.println(dequeue(ll));
        System.out.println(first(ll));
        System.out.println(ll);
    }

    public static void enqueue(LinkedList<Object> ll,
                               Object value) {
        ll.push(value);
    }

    public static Object dequeue(LinkedList<Object> ll) {
        return ll.poll();
    }

    public static Object first(LinkedList<Object> ll) {
        return ll.getFirst();
    }
}
