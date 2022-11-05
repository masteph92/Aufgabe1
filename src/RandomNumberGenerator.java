import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberGenerator {
    private int _min;
    private int _max;
    private Random _random;

    public RandomNumberGenerator(int min, int max) {
        _min = min;
        _max = max;
        _random = new Random();
    }

    public void GenerateFile(String fileName, int limit) throws IOException {
        BufferedWriter buffer = null;
        try {
            buffer = new BufferedWriter(new FileWriter(fileName));

            for (int i = 0; i < limit; i++) {
                String line = GenerateRandomNumber() + System.lineSeparator();
                buffer.write(line);
            }

        } finally {
            if (buffer != null) {
                buffer.close();
            }
        }
    }

    private int GenerateRandomNumber() {
        return _random.nextInt(_max-_min) + _min;
    }
}
