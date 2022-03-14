import java.util.Scanner;

public class CalculatorAddAndSubtract {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Declares variables
        int optionChoice;
        double valueOne;
        double valueTwo;
        double calculationResult;

        // Calculator Menu Screen
        System.out.println("Calculator Menu");
        System.out.println("");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");

        // Prompts user to choose Addition or Subtraction
        System.out.println("Which operation do you want to perform?");
        optionChoice = scnr.nextInt();

        // Prompts user to input values
        System.out.print("Enter first operand: ");
        valueOne = scnr.nextDouble();
        System.out.print("Enter second operand: ");
        valueTwo = scnr.nextDouble();

        // Switch to choose Addition
        switch (optionChoice) {
            case 1:
                // Adds first and second value together
                calculationResult = valueOne + valueTwo;
                System.out.println("The result of the operation is " + calculationResult + ".");
                break;
            case 2:
                // Subtracts the second value from the first value
                calculationResult = valueOne - valueTwo;
                System.out.println("The result of the operation is " + calculationResult + ".");
                break;

            default:
                System.out.println("Error: Invalid selection!");
        }

    }
}
