import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Mahesh");
        name.add("Suresh");
        name.add("Ramesh");
        name.add("Naresh");
        name.add("Kalpesh");
        System.out.println("Before sort -> " + name);
        sortUsingJava8(name);
        System.out.println("After sort -> " + name);
    }

    private static void sortUsingJava8(List<String> name) {
        name.sort(String::compareTo);
    }
}
