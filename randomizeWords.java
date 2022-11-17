import java.util.Random;
import java.util.Scanner;

public class randomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            int two = rnd.nextInt(array.length);
            System.out.println(array[two]);
        }
    }
}
