import java.util.Scanner;

/**
 * @author Saahi Venkatraghavan
 */
public class Main {
    public static void main(String[] args) {
        // The image explains that the "triangular number" is a number that represents the
        // number of objects arranged in an equilateral triangle. The formula for finding
        // the nth triangular number is T_n = (n^2 + n) / 2.

        // The question is asking to write a function that, given an input number,
        // will find the index of the first triangular number that is bigger than
        // that input number.

        //For example, if the input is 20, the function should return 6, because the 6th
        // triangular number (T_6 = 21) is the first one that is bigger than 20.

        System.out.println("Enter number to be compared: ");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        scanner.nextLine();

        int triNum = 0;
        int check = 0;

        while (input > check) {
            check = (triNum * triNum + triNum) / 2;
            triNum++;
        }

        System.out.println(triNum - 1);
    }
}