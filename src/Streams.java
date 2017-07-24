import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = stringList.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        //Collectors
        String mergedString = stringList.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
        System.out.println("Merged String = " + mergedString);

        // Random
        Random random = new Random();
        random.ints().limit(2).forEach(System.out::println);

        // Map
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);

        //Filter
        int count = (int) stringList.stream().filter(String::isEmpty).count();
        System.out.println("string list is empty = " + count);

        // sorted
        Random random1 = new Random();
        random1.ints().limit(3).sorted().forEach(System.out::println);

        // Statistics
        IntSummaryStatistics statistics = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Highest number in List = " + statistics.getMax());
        System.out.println("Lowest number in List = " + statistics.getMin());
        System.out.println("Sum of all numbers = " + statistics.getSum());
        System.out.println("Average of all numbers = " + statistics.getAverage());
    }
}
