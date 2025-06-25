package level2.exercise1.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {
    public static Scanner sc = new Scanner(System.in);

    public static byte reedByte(String message) {
        while(true) {
            System.out.println(message);
            try {
                byte num = sc.nextByte();
                sc.nextLine();
                return num;
            } catch (InputMismatchException exception) {
                System.out.println("Caught exception: " + exception.getMessage() + ". Enter a valid value.");
                sc.nextLine();
            }
        }
    }

    public static int reedInt(String message) {
        while(true) {
            System.out.println(message);
            try {
                int num = sc.nextInt();
                sc.nextLine();
                return num;
            } catch (InputMismatchException exception) {
                System.out.println("Caught exception: " + exception.getMessage() + ". Enter a valid value.");
                sc.nextLine();
            }
        }
    }

    public static float reedFloat(String message) {
        while(true) {
            System.out.println(message);
            try {
                float num = sc.nextFloat();
                sc.nextLine();
                return num;
            } catch (InputMismatchException exception) {
                System.out.println("Caught exception: " + exception.getMessage() + ". Enter a valid value.");
                sc.nextLine();
            }
        }
    }

    public static double reedDouble(String message) {
        while(true) {
            System.out.println(message);
            try {
                double num = sc.nextDouble();
                sc.nextLine();
                return num;
            } catch (InputMismatchException exception) {
                System.out.println("Caught exception: " + exception.getMessage() + ". Enter a valid value.");
                sc.nextLine();
            }
        }
    }

    public static char reedChar(String message) {
        while(true) {
            System.out.println(message);
            try {
                String character = sc.nextLine();
                if (character.length() == 1) {
                    return character.charAt(0);
                } else {
                    throw new ReadException("Char is a value with only one character");
                }
            } catch (ReadException exception) {
                System.out.println("Caught exception: " + exception.getMessage() + ". Enter a valid value.");
            }
        }
    }

    public static String reedString(String message) {
        while(true) {
            System.out.println(message);
            try {
                String word = sc.nextLine();
                if (word != null && (word.equalsIgnoreCase("good") || word.equalsIgnoreCase("bad"))) {
                    return word;
                } else {
                    throw new ReadException("The question can only be answered with 'good' or 'bad'.");
                }
            } catch (ReadException exception) {
                System.out.println("Caught exception: " + exception.getMessage() + ". Enter a valid value.");
            }
        }
    }

    public static boolean reedYesNo(String message) {
        while(true) {
            System.out.println(message);
            try {
                String word = sc.nextLine();
                if (word.equalsIgnoreCase("y")) {
                    return true;
                } else if (word.equalsIgnoreCase("n")) {
                    return false;
                } else {
                    throw new ReadException("You can only type 'y' or 'n'.");
                }
            } catch (ReadException exception) {
                System.out.println("Caught exception: " + exception.getMessage() + ". Enter a valid value.");
            }
        }
    }



}
