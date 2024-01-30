import java.util.Scanner;

import DS.*;

public class DSDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (args.length == 0 || args.length > 1) {
            System.out.println("Usage: java DSDemo.java DATA_STRUCTURE_NUMBER\n\n1: Stack\n2: Queue\n3: Linked List");
            System.exit(-1);
        }

        if (args[0].equals("1")) {
            Stack stack = new Stack();

            System.out.println("Initializing an empty stack.");
            System.out.println(stack.getStack());
            System.out.println("\nType \"+\" to add a number or \"-\" to remove the last number from the stack\n");
            
            String input;
            while (true) {
                do {
                    System.out.println("Add/remove:");
                    input = scanner.nextLine();
                } while (!input.equals("+") && !input.equals("-")); // Check input

                if (input.equals("+")) { // Add element
                    do {
                        System.out.println("\nInput:");
                        input = scanner.nextLine();
                    } while (!isNumeric(input));

                    stack.add(Integer.valueOf(input)); // Add number to stack
                    System.out.println(stack.getStack()); // Print stack

                } else { // Remove element
                    stack.remove(); // Remove last element from stack
                    System.out.println(stack.getStack()); // Print stack
                }
            }
        }

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null || strNum.isEmpty()) {
            return false;
        }

        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
}