package Task2_1;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>() {

            @Override
            public boolean add(Integer integer) {
                for (int i = 0; i < this.size(); i++) {
                    this.set(i, this.get(i) + integer);
                }
                super.add(integer);
                System.out.println(this);
                return true;
            }

            @Override
            public boolean remove(Object integer) {
                if (super.remove(integer)) {
                    for (int i = 0; i < this.size() - 1; i++) {
                        this.set(i, this.get(i) - (int) integer);
                    }
                    System.out.println(this);
                    return true;
                } else {
                    System.out.println(this);
                    return false;
                }


            }
            @Override
            public Integer remove(int index) {
                int valueToRemove = this.get(index);
                for (int i = 0; i < this.size(); i++) {
                    this.set(i, this.get(i) - valueToRemove);
                }
                super.remove(index);
                System.out.println(this);

                return null;
            }

        };
        int decision;

        do {
            System.out.println("Choose what to do:");
            System.out.println("1) to add an element;");
            System.out.println("2) to remove an element by value;");
            System.out.println("3) to remove an element by index;");
            System.out.println("4) to find an element by value;");
            System.out.println("5) to find an element by index;");
            System.out.println("6) to find a minimal element;");
            System.out.println("7) to find a maximal element;");
            System.out.println("8) to find a direct average of elements;");
            System.out.println("9) to quit the program");

            decision = getIntFromScanner(in, "Incorrect input! Try again!");
            switch (decision) {
                case 1: {
                    System.out.print("Enter an element to add: ");
                    arrayList.add(getIntFromScanner(in, "Incorrect input! Try again!"));
                    break;
                }
                case 2: {
                    System.out.print("Enter an element value to remove: ");
                    arrayList.remove((Object)getIntFromScanner(in, "Incorrect input! Try again!"));
                    break;
                }
                case 3: {
                    System.out.print("Enter the index of an element to remove: ");
                    int index = getIntFromScanner(in, "Incorrect input! Try again!");
                    if (index < arrayList.size() && index >= 0){
                        arrayList.remove(index);
                    } else System.out.println("Incorrect input! Try again!");

                    break;
                }
                case 4: {
                    System.out.print("Enter an element value to find: ");
                    int element = getIntFromScanner(in, "Incorrect input! Try again!");
                    System.out.println("This element was found in: " + arrayList.indexOf(element));
                    break;
                }
                case 5: {
                    System.out.print("Enter an element index to find: ");
                    int index = getIntFromScanner(in, "Incorrect input! Try again!");
                    if (index < arrayList.size() && index >= 0) {
                        System.out.println("In " + index + " there is " + arrayList.get(index));
                    } else System.out.println("Incorrect input! Try again!");
                    break;
                }
                case 6: {
                    int minElement = Integer.MAX_VALUE;
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) < minElement) {
                            minElement = arrayList.get(i);
                        }
                    }
                    System.out.println("Minimal element of the list is " + minElement);
                    break;
                }
                case 7: {
                    int maxElement = Integer.MIN_VALUE;
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) > maxElement) {
                            maxElement = arrayList.get(i);
                        }
                    }
                    System.out.println("Maximal element of the list is " + maxElement);
                    break;
                }
                case 8: {
                    int sum = 0;
                    for (int i = 0; i < arrayList.size(); i++) {
                        sum += arrayList.get(i);
                    }
                    double directAverage = sum / arrayList.size();
                    System.out.println("Direct average of the list is " + directAverage);
                    break;
                }
                case 9: {
                    System.out.println("Thanks for using my program! Goodbye!");
                    break;
                }
                default: {
                    System.out.println("Incorrect input! Try again!");
                }
            }


        } while (decision != 9);


    }

    private static int getIntFromScanner(Scanner sc, String errorMessage) {
        while (!sc.hasNextInt()) {
            System.err.println(errorMessage);
            sc.next();
        }
        return sc.nextInt();
    }

}
