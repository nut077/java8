package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        List<Integer> sizes = Stream.of("Anakin", "Luke", "Darth Vader").map(String::length).collect(Collectors.toList());
        System.out.println(sizes);

        String[][] data = new String[][]{{"Anakin", "Luke"},{"Darth Vader", "Han Solo", "Stormtrooper"}, {"Cherprang"}};
        List<String> datas = Arrays.stream(data).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(datas);
    }
}
