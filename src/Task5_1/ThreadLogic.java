package Task5_1;


import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class ThreadLogic implements Runnable {
    private String name;
    boolean isOver = false;

    private Queue<Integer> queue = new LinkedList<>();
    private int countNoClients = 0;


    ThreadLogic(String name) {
        Thread thread;
        this.name = name;
        thread = new Thread(this, name);
        thread.start();


    }


    private void runClientToWindow(int client) {

        int window;
        switch (name){
            case "queue for electronics":{
                window = 1;
                break;
            }
            case "queue for furniture":{
                window = 2;
                break;
            }
            default: {
                window = 3;
            }
        }
        System.out.println("Client number " + client + ", please come to window " + window);
    }


    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 30000));
            runClientToWindow(queue.remove());
            countNoClients = 0;
            run();

        } catch (InterruptedException | NoSuchElementException e) {
            if (isOver){

            } else if (countNoClients++ == 0) {
                System.out.println("Workers of " + name + " decided to go and drink some coffee.");
                run();
            } else {
                System.out.println("Workers of " + name + " are still at coffee break!");
            }

        } finally {
            if (!isOver && !queue.isEmpty()){
                run();
            }
        }

    }

    void addQueueMember(int member) {
        System.out.println("Your number is " + member + ". Please wait! Estimated waiting time is " + ((queue.size() + 1) * 15) + " seconds.");
        queue.offer(member);

    }


}
