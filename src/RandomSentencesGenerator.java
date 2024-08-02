import java.util.Random;
import java.util.Scanner;

public class RandomSentencesGenerator {

    private static String[] names = {"Taylor", "Augustine", "Dorothea", "Betty"};
    private static String[] places = {"New York", "L.A.", "The Lakes", "London"};
    private static String[] verbs = {"sings", "plays", "cries", "drives", "drinks"};
    private static String[] nouns = {"stones", "cake", "apple", "necklace", "the getaway car"};
    private static String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
    private static String[] details = {"near the river", "at home", "in the park"};

    private static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the random sentence generator!");
        System.out.println("Press [Enter] to generate a new sentence.");

        while (true) {
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetail = getRandomWord(details);


            String sentence = randomName + " from " + randomPlace + " " + randomAdverb + " " +
                    randomVerb + " " + randomNoun + " " + randomDetail + ".";
            System.out.println(sentence);

            scanner.nextLine();
        }
    }
}
