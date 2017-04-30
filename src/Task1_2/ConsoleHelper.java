package Task1_2;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleHelper {
    private static int size;
    private Scanner in = new Scanner(System.in);


    public void start() {
        int option;
        hello();
        size = in.nextInt();
        ArrayHolder arrayHolder = new ArrayHolder(size);
        arrayHolder.fillArray(arrayHolder.getMas());
        System.out.println("Your array is: " + Arrays.toString(arrayHolder.getMas()));
        do {
            menu();
            option = in.nextInt();
            switch (option) {
                case 1: {
                    System.out.print(writeMessageForElement());
                    int element = in.nextInt();
                    System.out.println("The element " + element + " is found in " + arrayHolder.findElement(element));
                    break;
                }
                case 2: {
                    arrayHolder.sortArrayInAscending();
                    System.out.println(Arrays.toString(arrayHolder.getMas()));
                    break;
                }
                case 3: {
                    arrayHolder.sortArrayInDescending();
                    System.out.println(Arrays.toString(arrayHolder.getMas()));
                    break;
                }
                case 4: {
                    bye();
                    break;
                }
                default: {
                    error();
                    break;
                }
            }
        } while (option != 4);
    }

    private void hello() {
        System.out.println("Welcome to my program! I hope you will enjoy it!\nPlease enter the size of the array, program will fill it automatically: ");
    }

    private void bye() {
        System.out.println("Thanks for using my program!");
    }

    private void error() {
        System.out.println("You entered wrong value! Please try again!");
    }

    private void menu() {
        System.out.println("What do you want to do?\n1) to find an element;\n2) to sort the array in ascending order;\n3) to sort the array in descending order:\n4) to quit the program");


    }

    private String writeMessageForElement() {
        return "Enter an element you want to find: ";
    }


}

