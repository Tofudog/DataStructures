import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Maps {

    public Maps() {

    }

    public static void main(String[] args) {
        Map<String, Integer> calendar = new TreeMap<>();
//        calendar.put("January", 1);
//        calendar.put("February", 2);
//        calendar.put("March", 3);
//        calendar.put("April", 4);
//        calendar.put("April", 1);
        calendar.put("foo", 12);
        calendar.put("foo", 11);

        System.out.println(calendar.get("foo"));
    }

}
