package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
//        String input = scanner.nextLine();

        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String yN = scanner.next();
        scanner.nextLine();
        if (yN.equalsIgnoreCase("y")) {
//            System.out.printf("You typed %s. Returning true.", yN);
            return true;
        }
//        System.out.printf("You typed %s. Returning false.", yN);
        return false;
    }

    public int getInt(int min, int max, String prompt) {
        int input = getInt(prompt);
        if (input < min || input > max) {
            System.out.println("Try another number between " + min + " and " + max);
            getInt(min, max, prompt);
        }
        return input;
    }

    public int getInt(String prompt) {
        do {
            try {
                String s = getString(prompt);
                return Integer.valueOf(s);
            } catch (NumberFormatException e){
                System.out.println("You didn't type in an integer dummy!");
            }
        } while (true);
    }


    public double getDouble(double min, double max, String prompt) {
        double inputNum = getDouble(prompt);
        if (inputNum > min && inputNum < max) {
            System.out.println("Your input is valid.");
        } else {
            System.out.println("Try another number between " + min + "and " + max);
            return getDouble(min, max, prompt);
        }
        return inputNum;
    }

    public double getDouble(String prompt) {
        do {
            try {
                String s = getString(prompt);
                return Double.valueOf(s);
            } catch (NumberFormatException e) {
                System.out.println("You didn't input a double dummy!");
            }
        } while (true);
    }


}
