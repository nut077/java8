import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Print all numbers: ");
        eval(list, n -> true);

        System.out.println("Print even numbers:");
        eval(list, n -> n % 2 == 0);

        System.out.println("Print numbers greater than 3:");
        eval(list, n -> n > 3);
    }

    private static void eval(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(predicate::test).forEach(n -> System.out.println(n + " "));
    }
}
