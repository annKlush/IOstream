package task1;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("file.txt");
        Scanner scanner = new Scanner(inputStream);


        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String regex1 = "\\d{3}-\\d{3}-\\d{4}";
            String regex2 = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}";
            if (s != null && s.matches(regex1) || s.matches(regex2)) {
                System.out.println(s);
            }
        }
        scanner.close();
    }
}
