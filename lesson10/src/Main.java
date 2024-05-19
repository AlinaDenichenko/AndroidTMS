import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a document number: ");
        String documentNumber = scanner.nextLine();

        System.out.println(DocumentNumberService.getBlocksWithNumber(documentNumber));
        System.out.println(DocumentNumberService.hideLetters(documentNumber));
        System.out.println(DocumentNumberService.getLetters(documentNumber));
        System.out.println(DocumentNumberService.getLettersStringBuilder(documentNumber));
        System.out.println(DocumentNumberService.checkLetters(documentNumber));
        System.out.println(DocumentNumberService.checkStart(documentNumber));
        System.out.println(DocumentNumberService.checkEnds(documentNumber));
    }
}