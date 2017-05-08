package KrestikiNoliki;
import java.util.Scanner;



class GameLogic {
    private static Field field = new Field();
    private Scanner in = new Scanner(System.in);
    private int checkLines(){
        if (field.getMas()[0].equals(field.getMas()[1]) && field.getMas()[1].equals(field.getMas()[2])){
            if (field.getMas()[0].equals("X")){
                return 1;
            }
            else {
                return 2;
            }
        } else if (field.getMas()[3].equals(field.getMas()[4]) && field.getMas()[4].equals(field.getMas()[5])){
            if (field.getMas()[3].equals("X")){
                return 1;
            }
            else {
                return 2;
            }
        } else if (field.getMas()[6].equals(field.getMas()[7]) && field.getMas()[7].equals(field.getMas()[8])){
            if (field.getMas()[6].equals("X")){
                return 1;
            }
            else {
                return 2;
            }
        } else if (field.getMas()[0].equals(field.getMas()[3]) && field.getMas()[3].equals(field.getMas()[6])){
            if (field.getMas()[0].equals("X")){
                return 1;
            }
            else {
                return 2;
            }
        } else if (field.getMas()[1].equals(field.getMas()[4]) && field.getMas()[4].equals(field.getMas()[7])){
            if (field.getMas()[1].equals("X")){
                return 1;
            }
            else {
                return 2;
            }
        } else if (field.getMas()[2].equals(field.getMas()[5]) && field.getMas()[5].equals(field.getMas()[8])){
            if (field.getMas()[2].equals("X")){
                return 1;
            }
            else {
                return 2;
            }
        } else if (field.getMas()[0].equals(field.getMas()[4]) && field.getMas()[4].equals(field.getMas()[8])){
            if (field.getMas()[0].equals("X")){
                return 1;
            }
            else {
                return 2;
            }
        } else if (field.getMas()[2].equals(field.getMas()[4]) && field.getMas()[4].equals(field.getMas()[6])){
            if (field.getMas()[2].equals("X")){
                return 1;
            }
            else {
                return 2;
            }
        } else return 0;
    }

    private int setDecision(Scanner in){
            while (!in.hasNextInt()) {
                System.err.println("Incorrect input! Try again!");
                in.next();
            }
            return in.nextInt();
        }

    private void computerSetsDecision(){
        boolean success = false;
        while (!success) {
            int decision = (int) (Math.random() * 8.999999999999999);
            if (!(field.getMas()[decision].equals("X") || field.getMas()[decision].equals("O"))){
                field.getMas()[decision] = "O";
                success = true;
            }
        }

    }

    void start(){
        field.setField();
        for (int i = 0; i < 9; i++){
            field.getField();
            if (i % 2 == 0){
                System.out.print("Choose where to put X: ");

                field.getMas()[setDecision(in)] = "X";
            } else {
                computerSetsDecision();
            }
            if (i >= 4){
                if (checkLines() == 1){
                    field.getField();
                    System.out.println("You won!");
                    return;
                } else if (checkLines() == 2){
                    field.getField();
                    System.out.println("You lost!");
                    return;
                }
            }
        }
        System.out.println("It's draw!");

    }
}
