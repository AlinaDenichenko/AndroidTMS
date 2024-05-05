import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter number of task: ");
            number = scanner.nextInt();
            switch (number) {
                case 1: {
                    Main.firstTaskNumberInArray();
                    break;
                }
                case 2: {
                    Main.secondTaskNumberDeleteFromArray();
                    break;
                }
                case 3: {
                    Main.thirdTaskMaxMinAverageNumberInArray();
                    break;
                }
                case 4: {
                    Main.fourthTaskArrayInReverseOrder();
                    break;
                }
            }
        } while (number != 0);
    }

    public static void firstTaskNumberInArray() {
        int[] array = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int j : array) {
            System.out.printf("%s ", j);
        }
        System.out.println();

        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        for (int j : array) {
            if (number == j) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Number is in array");
        else System.out.println("Number is not in array");
    }

    public static void secondTaskNumberDeleteFromArray() {
        int[] array = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int j : array) {
            System.out.printf("%s ", j);
        }
        System.out.println();

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        int count = 0;
        for (int j : array) {
            if (number != j) count++;
        }
        int[] newMas = new int[count];
        int i = 0;

        for (int j : array) {
            if (j != number) {
                newMas[i] = j;
                i++;
            }
        }

        for (int j : newMas) {
            System.out.printf("%s ", j);
        }
        System.out.println();
    }

    public static void thirdTaskMaxMinAverageNumberInArray() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int j : array) {
            System.out.printf("%s ", j);
        }
        System.out.println();

        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int j : array) {
            sum += j;
            if (j > max) max = j;
            if (j < min) min = j;
        }
        float avg = (float) sum / array.length;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);
    }

    public static void fourthTaskArrayInReverseOrder() {
        int[] array = new int[10];
        int[] newArray = new int[10];
        int index = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(10);

        for (int j : array) System.out.printf("%s ", j);
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            newArray[index] = array[i];
            index++;
        }

        for (int j : newArray) System.out.printf("%s ", j);
        System.out.println();
    }
}