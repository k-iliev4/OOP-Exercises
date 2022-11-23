//Write a program that generates random fake advertisement messages to extol some product.
// The messages must consist of 4 parts: laudatory phrase + event + author + city.
// Use the following predefined parts:
//• Phrases – {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."}
//• Events – {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"}
//• Authors – {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"}
// • Cities – {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"}
//The format of the output message is: {phrase} {event} {author} – {city}.
//As an input, you take the number of messages to be generated. Print each random message on a separate line.

import java.util.*;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            System.out.println(phrases.get(random.nextInt(phrases.size())) + " " + events.get(random.nextInt(events.size()))+ " " + authors.get(random.nextInt(authors.size()))+ " - "+cities.get(random.nextInt(cities.size())));
        }

    }
}
