package Task5_1;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {


    private static Scanner in = new Scanner(System.in);

    private static int memberNumber = 0;
    private static int decision = 0;

    public static void main(String[] args) {
        ThreadLogic threadElectronics = new ThreadLogic("queue for electronics");
        ThreadLogic threadFurniture = new ThreadLogic("queue for furniture");
        ThreadLogic threadKBT = new ThreadLogic("queue for major appliances");
        while (decision != 4) {
        System.out.println("Hello! What goods did you come for?");
        System.out.println("1) some small electronic gadgets or computer parts;");
        System.out.println("2) furniture elements;");
        System.out.println("3) major appliances;");
        System.out.println("4) working day is over, let's close");

            decision = getIntFromScanner();
            switch (decision) {
                case 1: {
                    threadElectronics.addQueueMember(++memberNumber);
                    break;
                }
                case 2: {
                    threadFurniture.addQueueMember(++memberNumber);
                    break;
                }
                case 3: {
                    threadKBT.addQueueMember(++memberNumber);
                    break;
                }
                case 4: {
                    System.out.println("Goodbye! Our shop will be closed as soon as we serve all the clients!");
                    threadElectronics.isOver = true;
                    threadFurniture.isOver = true;
                    threadKBT.isOver = true;
                    break;
                }
                default: {
                    System.out.println(errorMessage());
                }
            }
        }


    }

    private static synchronized String errorMessage() {
        return "Incorrect input! Please try again!";
    }

    private static synchronized int getIntFromScanner() {
        int i;
        try {
            i = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(errorMessage());
            in.next();
            i = getIntFromScanner();
        }
        return i;
    }
}
