import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentNumberService {
    public static String getBlocksWithNumber(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        Pattern pattern = Pattern.compile("[0-9]+");
        String numbers = "";

        for (String block : blocks) {
            Matcher matcher = pattern.matcher(block);
            if (matcher.matches()) {
                numbers = numbers.concat(block);
            }
        }
        return numbers;
    }

    public static String hideLetters(String documentNumber) {
        return documentNumber.replaceAll("[A-Za-z]{3}", "***");
    }

    public static String getLetters(String documentNumber) {
        return documentNumber
                .replaceAll("[0-9/-]", "/")
                .toLowerCase()
                .replaceAll("[/]+", "/")
                .substring(1);
    }

    public static String getLettersStringBuilder(String documentNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append("Letters:")
                .append(getLetters(documentNumber)
                        .toUpperCase())
                .toString();
    }

    public static boolean checkLetters(String documentNumber) {
        return documentNumber.contains("abc");
    }

    public static boolean checkStart(String documentNumber) {
        return documentNumber.startsWith("555");
    }

    public static boolean checkEnds(String documentNumber) {
        return documentNumber.endsWith("1a2b");
    }
}
