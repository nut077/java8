import java.util.stream.IntStream;

public class BuiltInOperations {
    public static void main(String[] args) {
        Double average = IntStream.of(1, 2, 3, 4, 5).average().orElse(0);
        System.out.println(average);

        Long count = IntStream.of(1, 2, 3, 4, 5).count();
        System.out.println(count);

        Integer min = IntStream.of(1, 2, 3, 4, 5).min().orElse(0);
        System.out.println(min);

        Integer max = IntStream.of(1, 2, 3, 4, 5).max().orElse(0);
        System.out.println(max);

        Integer sum = IntStream.of(1, 2, 3, 4, 5).sum();
        System.out.println(sum);
    }
}
