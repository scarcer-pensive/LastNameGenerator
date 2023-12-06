import java.util.Random;

public class LastNameGenerator {
    private static final String[] PREFIXES = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis"};
    private static final String[] SUFFIXES = {"son", "sen", "ley", "man", "berg"};

    public static String generateLastName() {
        Random random = new Random();
        String prefix = PREFIXES[random.nextInt(PREFIXES.length)];
        String suffix = SUFFIXES[random.nextInt(SUFFIXES.length)];
        return prefix + suffix;
    }
}
