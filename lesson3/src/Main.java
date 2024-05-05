import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number of task: ");
            number = scanner.nextInt();
            switch (number) {
                case 1: {
                    Main.firstTaskSeasons();
                    break;
                }
                case 2: {
                    Main.secondTaskSeasons();
                    break;
                }
                case 3: {
                    System.out.println(Main.thirdTaskIsEven());
                    break;
                }
                case 4: {
                    Main.fourthTaskTemperature();
                    break;
                }
                case 5: {
                    Main.fifthTaskOddNumbers();
                    break;
                }
                case 6: {
                    Main.sixthTaskNumbers();
                    break;
                }
                case 7: {
                    Main.seventhTaskSumOfNumber();
                    break;
                }
                case 8: {
                    Main.eighthTaskSubsequenceOfSeven();
                    break;
                }
            }
        } while (number != 0);
    }

    public static void firstTaskSeasons() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int number = scanner.nextInt();

        switch (number) {
            case 12:
            case 1:
            case 2: {
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Spring");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Summer");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Autumn");
                break;
            }
            default:
                System.out.println("Invalid input");
        }
    }

    public static void secondTaskSeasons() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int number = scanner.nextInt();

        if (number == 12 || number == 1 || number == 2) {
            System.out.println("Winter");
        } else if (number == 3 || number == 4 || number == 5) {
            System.out.println("Spring");
        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("Summer");
        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Invalid input");
        }
    }

    public static boolean thirdTaskIsEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        return number % 2 == 0;
    }

    public static void fourthTaskTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of temperature: ");
        int number = scanner.nextInt();
        if (number > -5) System.out.println("Warm");
        else if (number > -20) System.out.println("Normal");
        else System.out.println("Cold");
    }

    public static void fifthTaskOddNumbers() {
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) System.out.printf("%s, ", i);
        }
        System.out.println();
    }

    public static void sixthTaskNumbers() {
        for (int i = 5; i > 0; i--) {
            System.out.printf("%s, ", i);
        }
        System.out.println();
    }

    public static void seventhTaskSumOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.printf("Sum of numbers: %s", sum);
        System.out.println();
    }

    public static void eighthTaskSubsequenceOfSeven() {
        int i = 0;
        while (i < 98) {
            i += 7;
            System.out.printf("%s, ", i);
        }
        System.out.println();
    }
}