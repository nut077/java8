import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anakin", "Luke", "Darth Vader", "Han Solo", "Stormtrooper", "Cherprang");
        String names = list.stream().filter(name -> name.length() > 8)
            .peek(System.out::println)
            .reduce((result, name) -> result + ", " + name).orElse("");
        System.out.println(names);
    }
}
