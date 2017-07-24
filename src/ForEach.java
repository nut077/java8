import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Mahesh");
        name.add("Suresh");
        name.add("Ramesh");
        name.add("Naresh");
        name.add("Kalpesh");

        name.forEach(System.out::println);
    }
}
