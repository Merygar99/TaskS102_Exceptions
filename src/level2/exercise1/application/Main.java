package level2.exercise1.application;

import level2.exercise1.model.Entry;

public class Main {
    public static void main(String[] args) {

        boolean getOut = false;

        while (!getOut) {
            System.out.println("Answer the next questions");
            System.out.println("1.Age.");
            System.out.println("2.The number of people who lives in your city.");
            System.out.println("3.Your mesure.");
            System.out.println("4.What is your school average?");
            System.out.println("5.What is the first letter of your name?");
            System.out.println("6.How are you? (Answer with 'good' or 'bad')");
            System.out.println("7.You like to program?");
            System.out.println("8. Finish answering the questions");

            int option = Entry.reedInt("Choose a option.");
            Entry.sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Your age is " + Entry.reedByte("How old are you?"));
                    break;
                case 2:
                    System.out.println("In your city lives " + Entry.reedInt("How many people live in your city?"));
                    break;
                case 3:
                    System.out.println("Your measure is " + Entry.reedFloat("How tall are you"));
                    break;
                case 4:
                    System.out.println("Your average is " + Entry.reedDouble("What is your school average?"));
                    break;
                case 5:
                    System.out.println("Your name initial is " + Entry.reedChar("What is the first letter of your name?"));
                    break;
                case 6:
                    System.out.println("Your are " + Entry.reedChar("How are you? (Answer with 'good' or 'bad')"));
                    break;
                case 7:
                    System.out.println("Your are " + Entry.reedChar("You like to program? (Answer with 'y' = yes or 'n' = no)"));
                    break;
                case 8:
                    System.out.println("Leaving the program, thank you very much for participating");
                    getOut = true;
                    break;

            }
        }
    }
}
