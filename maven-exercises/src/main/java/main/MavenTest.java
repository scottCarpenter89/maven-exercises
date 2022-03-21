package main;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class MavenTest {
    private static Input input = new Input();

    public static void main(String[] args) {

        isANumber();
        flipCase();
        reverseString();
    }


    public static void isANumber() {
        boolean loopingUserInput = true;
        while (loopingUserInput) {
            CharSequence userInput = input.getString("Enter a number.");
            if (StringUtils.isNumericSpace(userInput)) {
                System.out.printf("%nYour number \"%s\" is valid", userInput);
                loopingUserInput = false;
            } else {
                System.out.printf("Your input \"%s\" is invalid. Please use a number.%n%n", userInput);
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void flipCase() {
        String userInput = input.getString("Enter a sentence and witness your basket case.");
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println();
        System.out.println();
    }

    public static void reverseString() {
        String userInput = input.getString("Enter anything and watch me script in reverse!");
        System.out.println(StringUtils.reverse(userInput));
        ;
    }
}
