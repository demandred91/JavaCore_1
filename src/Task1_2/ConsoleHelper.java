package Task1_2;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleHelper {
    private static int size;
    private Scanner in = new Scanner(System.in);
    private static ArrayHolder arrayHolder = new ArrayHolder(size);


    public void start() {
        hello();
        size = in.nextInt();
        arrayHolder.fillArray(arrayHolder.getMas());
        menu();
        String option = in.nextLine();
        do {
            switch (option) {
                case "1": {
                    System.out.print(writeMessageForElement());
                    int element = in.nextInt();
                    System.out.print("The element" + element + "is found in " + arrayHolder.findElement(element));
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
                    bye();
                    break;
                }
                default: {
                    error();
                    break;
                }
            }
        } while (!(option.equals("4")));
    }

    private String hello() {
        return "Welcome to my program! I hope you will enjoy it! Please enter the size of the array, program will fill it automatically: ";
    }

    private String bye() {
        return "Thanks for using my program!";
    }

    private String error() {
        return "You entered wrong value! Please try again!";
    }

    private String[] menu() {
        return new String[]{
                "What do you want to do?\n",
                "1) to find an element;\n",
                "2) to sort the array in ascending order;\n",
                "3) to sort the array in descending order:\n",
                "4) to quit the program\n"
        };
    }

    private String writeMessageForElement() {
        return "Enter an element you want to find: ";
    }


}

