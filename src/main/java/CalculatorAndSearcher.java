import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Kondratov on 20.03.2018.
 *
 * @author Kondratov
 * @version 1.0
 * @see #calculator()
 * @see #searchLongestWord()
 */
public class CalculatorAndSearcher {
    public static void main(String[] args) {
        try {
            System.out.println("Enter number of task: (1 - calculator, 2 - string array).");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i == 1) {
                calculator();
            } else if (i == 2) {
                searchLongestWord();
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong! Choose 1 or 2!");
        }
    }

    /**
     * The method that implements the console calculator
     *
     * @see #add(double, double)
     * @see #subtract(double, double)
     * @see #multiply(double, double)
     * @see #divide(double, double)
     */
    public static void calculator() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first figure: ");
            double i = sc.nextDouble();
            System.out.println("Enter the second figure: ");
            double j = sc.nextDouble();
            System.out.println("Select the operation: +, - , /, *");
            String text = sc.next();
            switch (text) {
                case ("+"):
                    System.out.printf("Result is: %.4f", add(i, j));
                    break;
                case ("-"):
                    System.out.printf("Result is: %.4f", subtract(i, j));
                    break;
                case ("*"):
                    System.out.printf("Result is: %.4f", multiply(i, j));
                    break;
                case ("/"):
                    System.out.printf("Result is: %.4f", divide(i, j));
                    break;
                default:
                    throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }

    /**
     * The method for searching and printing to the console the longest words and the number of letters in these words.
     */
    public static void searchLongestWord() {
        try {
            System.out.println("Enter the number of word's in array:");
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            String[] wordArray = new String[count];
            int[] array = new int[count];
            System.out.println("Enter " + count + " words in array:");
            for (int i = 0; i < count; i++) {
                Scanner scannerWord = new Scanner(System.in);
                wordArray[i] = scannerWord.next();
                array[i] = wordArray[i].length();
            }
            Arrays.sort(array);
            System.out.println("The longest word of " + array[count - 1] + " letters.");
            System.out.println("Below are the longest words from the array you entered:");
            for (int i = 0; i < count; i++) {
                if (wordArray[i].length() == array[count - 1]) {
                    System.out.println(wordArray[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }

    /**
     * Method for adding two numbers.
     *
     * @param i the number that was introduced first (first summand)
     * @param j the number that was introduced second (first summand)
     * @return double value
     */
    public static double add(double i, double j) {
        return i + j;
    }

    /**
     * The method for subtraction from one number is another.
     *
     * @param i the number that was introduced first (minuend)
     * @param j the number that was introduced second (subtrahend)
     * @return double value
     */
    public static double subtract(double i, double j) {
        return i - j;
    }

    /**
     * The method for multiplying two numbers
     *
     * @param i the number that was introduced first (first factor)
     * @param j the number that was introduced second (second factor)
     * @return double value
     */
    public static double multiply(double i, double j) {
        return i * j;
    }

    /**
     * The method for dividing one number by another
     *
     * @param i the number that was entered first (divisible)
     * @param j the number that was entered by the second (divisor)
     * @return double value
     */
    public static double divide(double i, double j) {
        return i / j;
    }
}
