package Task2_2;

import java.util.*;


class QueueHolder {

    private Queue<Integer> myQueue = new LinkedList<Integer>() {

    };

    private int queueSize = 16;
    private boolean isInitialSize = true;
    private static Scanner in = new Scanner(System.in);

    int getQueueSize() {
        return queueSize;
    }

    void changeQueueSize() {
        if (!isInitialSize) {
            System.out.println("Queue size is already not initial! It is " + queueSize);
        } else {
            System.out.println("Queue size is " + queueSize);
            System.out.println("Enter new size: ");

            try{
                queueSize = getIntFromScanner();
                if (queueSize < myQueue.size()){
                    throw new QueueSizeException();
                }
                isInitialSize = false;
            } catch (QueueSizeException e){
                System.out.println("Queue is already bigger than the size you entered!");
                queueSize = 16;
            }
        }
        printQueue();
    }

    void addElement() {
        System.out.print("Enter an element to add: ");
        if (myQueue.size() == queueSize) {
            myQueue.remove();
        }
        myQueue.add(getIntFromScanner());
        printQueue();
    }

    private void printQueue() {
        Queue<Integer> myQueueCopy = new LinkedList<>();
        myQueueCopy.addAll(myQueue);
        for (int i = 0; i < myQueue.size(); i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(myQueueCopy.poll());
        }
        System.out.println();
    }

    static int getIntFromScanner() {
        int i;
        try {
            i = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input! Please try again!");
            in.next();
            i = getIntFromScanner();
        }
        return i;
    }

}

