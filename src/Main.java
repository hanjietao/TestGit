import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int MAXIMUM_CAPACITY = 1 << 30;

        System.out.println(MAXIMUM_CAPACITY);

        ConcurrentHashMap<String,Object> c = new ConcurrentHashMap<>();

    }
}
