package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String names = Stream.of("aaa", "bbb", "ccc").collect(Collectors.joining(","));
        System.out.println(names);

        List<Integer> nums = Stream.iterate(1, n -> n + 1).limit(10).collect(Collectors.toList());
        System.out.println(nums);

        List<Integer> nums2 = Stream.generate(() -> new Random().nextInt(10)).limit(10).collect(Collectors.toList());
        System.out.println(nums2);

        String[] list = {"aaa", "bbb", "ccc"};
        String name2 = Arrays.stream(list).collect(Collectors.joining(","));
        System.out.println(name2);

        List<String> list2 = Arrays.asList("aaa", "bbb", "ccc");
        String name3 = list2.stream().collect(Collectors.joining(","));
        System.out.println(name3);

        List<Integer> listInt = IntStream.range(10, 15).boxed().collect(Collectors.toList());
        System.out.println(listInt);
    }
}
