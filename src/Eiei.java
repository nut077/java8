import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Eiei {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        al.add("f");
        System.out.println(al.subList(2, 5));
    }
}
