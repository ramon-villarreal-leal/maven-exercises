import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter something: ");
        String something = sc.nextLine();
        System.out.println("You entered: \"" + something + "\"");
        System.out.println("\"" + something + "\" " + returnNumMessage(something));
        System.out.println("Flipped Case: " + StringUtils.swapCase(something));
        System.out.println("Reversed: " + StringUtils.reverse(something));
    }

    public static String returnNumMessage(String input) {
        return (StringUtils.isNumeric(input)) ? "is a number" : "is not a number";
    }
}
