import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberSorter {
    public static List<Integer> ReadNumbers(String fileName) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));

            List<Integer> numbers = new ArrayList<Integer>();

            String line;
            while((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                numbers.add(number);
            }

            return numbers;
        } finally {
            if (reader != null)
                reader.close();
        }
    }

    public static void WriteSorted(List<Integer> numbers) {

    }
}
