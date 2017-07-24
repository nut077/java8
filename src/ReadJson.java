import java.util.*;

public class ReadJson {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Juskkit Prite Nutwilai", "Juskkit Prite Nutwilai");
        hm.put("Thanaporn Jansech", "Thanaporn Jansech");
        hm.put("Thaveesit Chanseat", "Thaveesit Chanseat");
        hm.put("Chonlaton Chatpichet", "Chonlaton Chatpichet");
        List sortedKeys = new ArrayList(hm.keySet());
        sort(sortedKeys);
        sortedKeys.forEach(System.out::println);
    }

    private static void sort(List<String> name) {
        Collections.sort(name, String::compareTo);
    }
}
