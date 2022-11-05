import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

    }

    public static void FirstExercise() {
        System.out.println("## Aufgabe 1");

        RandomNumberGenerator rng = new RandomNumberGenerator(0, 5000);
        try {
            rng.GenerateFile("Zahlen_1", 100000);
            rng.GenerateFile("Zahlen_2", 1000000);
            rng.GenerateFile("Zahlen_3", 5000000);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    


}