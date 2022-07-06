/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *
 * @author Ayba
 */
public class UserIOImpl implements UserIO {

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        boolean isValid = false;
        String value;
        do {
            System.out.println(prompt);
            value = inputReader.nextLine();
            isValid = checkStrin(value);
        } while (!isValid);
        return value;

    }

    @Override
    public int readInt(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        boolean isValid = false;
        String value;
        do {
            System.out.println(prompt);
            value = inputReader.nextLine();
            isValid = checkNumber(value);
        } while (!isValid);
        int i = Integer.parseInt(value);
        return i;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner inputReader = new Scanner(System.in);
        boolean isValid = false;
        String value;
        do {
            System.out.println(prompt);
            value = inputReader.nextLine();
            isValid = checkNumber(value, min, max);
        } while (!isValid);
        int i = Integer.parseInt(value);
        return i;
    }

    @Override
    public double readDouble(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        boolean isValid = false;
        String value;
        do {
            System.out.println(prompt);
            value = inputReader.nextLine();
            isValid = checkDouble(value);
        } while (!isValid);
        double d = Double.parseDouble(value);
        return d;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner inputReader = new Scanner(System.in);
        boolean isValid = false;
        String value;
        do {
            System.out.println(prompt);
            value = inputReader.nextLine();
            isValid = checkDouble(value, min, max);
        } while (!isValid);
        double d = Double.parseDouble(value);
        return d;
    }

    @Override
    public float readFloat(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        boolean isValid = false;
        String value;
        do {
            System.out.println(prompt);
            value = inputReader.nextLine();
            isValid = checkDouble(value);
        } while (!isValid);
        float f = Float.parseFloat(value);
        return f;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner inputReader = new Scanner(System.in);
        boolean isValid = false;
        String value;
        do {
            System.out.println(prompt);
            value = inputReader.nextLine();
            isValid = checkDouble(value, min, max);
        } while (!isValid);
        float f = Float.parseFloat(value);
        return f;
    }

    @Override
    public long readLong(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        boolean isValid = false;
        String value;
        do {
            System.out.println(prompt);
            value = inputReader.nextLine();
            isValid = checkNumber(value);
        } while (!isValid);
        long l = Integer.parseInt(value);
        return l;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        Scanner inputReader = new Scanner(System.in);
        boolean isValid = false;
        String value;
        do {
            System.out.println(prompt);
            value = inputReader.nextLine();
            isValid = checkNumber(value, min, max);
        } while (!isValid);
        long l = Integer.parseInt(value);
        return l;
    }

    public static boolean checkStrin(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("String is null, empty or blank.");
            return false;
        }
        try {
            double d = Double.parseDouble(str);
            System.out.println("That was a whole number!");
            return false;
        } catch (NumberFormatException ex) {
            return true;
        }

    }

    private boolean checkNumber(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Number is null, empty or blank.");
            return false;
        }
        try {
            long l = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex) {
            System.out.println("That not was a whole number!");
            return false;
        }
    }

    private boolean checkNumber(String str, long min, long max) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Number is null, empty or blank.");
            return false;
        }

        try {
            long l = Integer.parseInt(str);
            if (l > min && l <= max) {
                return true;
            } else {
                System.out.println("Number is not correct");
                return false;
            }
        } catch (NumberFormatException ex) {
            System.out.println("That not was a whole number!");
            return false;
        }
    }

    private boolean checkDouble(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Number is null, empty or blank.");
            return false;
        }
        try {
            double d = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException ex) {
            System.out.println("That not was a whole number!");
            return false;
        }
    }
    
    private boolean checkDouble(String str, double min, double max) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Number is null, empty or blank.");
            return false;
        }

        try {
            double d = Double.parseDouble(str);
            if (d > min && d <= max) {
                return true;
            } else {
                System.out.println("Number is not correct");
                return false;
            }
        } catch (NumberFormatException ex) {
            System.out.println("That not was a whole number!");
            return false;
        }
    }

}
