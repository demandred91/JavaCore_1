package Task1_2;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleHelper {
    private static int size;
    private Scanner in = new Scanner(System.in);


    public void start() {
        String option;
        getHelloMessage();
        size = getIntFromScanner(in, getErrorMessage());
        ArrayHolder arrayHolder = new ArrayHolder(size);
        arrayHolder.fillArray(arrayHolder.getMas());
        System.out.println("Your initial array is: " + Arrays.toString(arrayHolder.getMas()));
        do {
            getMenu();
            option = in.next();
            switch (option) {
                case "1": {
                    System.out.print(writeMessageForElement());
                    int element = in.nextInt();
                    System.out.println("The element " + element + " is found in " + arrayHolder.findElement(element));
                    break;
                }
                case "2": {
                    arrayHolder.sortArrayInAscending();
                    System.out.println(Arrays.toString(arrayHolder.getMas()));
                    break;
                }
                case "3": {
                    arrayHolder.sortArrayInDescending();
                    System.out.println(Arrays.toString(arrayHolder.getMas()));
                    break;
                }
                case "4": {
                    getByeMessage();
                    break;
                }
                default: {
                    System.err.println(getErrorMessage());
                    break;
                }
            }
        } while (!option.equals("4"));
    }

    private void getHelloMessage() {
        System.out.println("Welcome to my program! I hope you will enjoy it!\nPlease enter the size of the array, program will fill it automatically: ");
    }

    private void getByeMessage() {
        System.out.println("Thanks for using my program!");
    }

    private String getErrorMessage() {
        return "You entered wrong value! Please try again!";
    }

    private void getMenu() {
        System.out.println("What do you want to do?\n1) to find an element;\n2) to sort the array in ascending order;\n3) to sort the array in descending order:\n4) to quit the program");


    }

    private String writeMessageForElement() {
        return "Enter an element you want to find: ";
    }

    private static int getIntFromScanner(Scanner sc, String errorMessage)
    {
        while (!sc.hasNextInt())
        {
            System.err.println(errorMessage);
            sc.next();
        }
        return sc.nextInt();
    }


}

