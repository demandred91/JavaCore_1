package Task2_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class QueueHolder {

    private Queue<Integer> myQueue = new LinkedList<Integer>() {

    };

    private int queueSize = 16;
    private boolean isInitialSize = true;

    private Scanner in = new Scanner(System.in);

    int getQueueSize() {
        return queueSize;
    }

    void changeQueueSize() {
        if (!isInitialSize) {
            System.out.println("Queue size is already not initial! It is " + queueSize);
        } else {
            System.out.println("Queue size is " + queueSize);
            isInitialSize = false;
            System.out.println("Enter new size: ");
            queueSize = getIntFromScanner(in, errorMessage());
            while (myQueue.size() > queueSize){
                myQueue.remove();
            }
        }
        printQueue();
    }

    void addElement() {
        System.out.print("Enter an element to add: ");
        if (myQueue.size() == queueSize) {
            myQueue.remove();
        }
        myQueue.add(getIntFromScanner(in, errorMessage()));
        printQueue();
    }

    void printQueue(){
        System.out.println(myQueue);
    }

    static int getIntFromScanner(Scanner sc, String errorMessage)
    {
        while (!sc.hasNextInt())
        {
            System.err.println(errorMessage);
            sc.next();
        }
        return sc.nextInt();
    }
    String errorMessage(){
        return "Incorrect input! Please try again!";
    }
}
