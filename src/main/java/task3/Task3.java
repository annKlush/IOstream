package task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;


public class Task3 {

    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("file3.txt");
        Scanner scanner = new Scanner(inputStream);
        Map<String, Integer> result = new HashMap<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] data = line.split(" ");
            int amount = 1;
            for (String dat : data) {
                if (!result.containsKey(dat)) {
                    result.put(dat, amount);
                } else {
                    result.put(dat, result.get(dat) + 1);
                }
            }
        }


        Comparator<String> comparator = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return result.get(o1) < result.get(o2) ? 1 : -1;
            }
        };

        Map<String, Integer> treeMap = new TreeMap<>(comparator);
        treeMap.putAll(result);
        System.out.println("Result of words = " + treeMap);

    }
}
