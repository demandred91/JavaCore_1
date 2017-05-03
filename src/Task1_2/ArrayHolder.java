package Task1_2;

public class ArrayHolder {
    private int[] mas;

    ArrayHolder(int arraySize) {
        mas = new int[arraySize];
    }


    int[] getMas() {
        return mas;
    }

    void fillArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) ((Math.random() * 10 + 1));
        }
    }

    void sortArrayInAscending() {
        for (int i = 1; i < mas.length; i++) {
            for (int j = 1; j < mas.length; j++) {
                if (mas[j] < mas[j - 1]) {
                    int swap = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = swap;
                }
            }
        }
    }

    void sortArrayInDescending() {
        for (int i = 1; i < mas.length; i++) {
            for (int j = 1; j < mas.length; j++) {
                if (mas[j] > mas[j - 1]) {
                    int swap = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = swap;
                }
            }
        }
    }

    String findElement(int element) {
        String string = "";
        boolean isInArray = false;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == element) {
                if (isInArray)
                    string += ", ";
                string += i;
                isInArray = true;

            }
        }
        if (string.equals("")) return ("NOWHERE\n");
        return string;
    }


}

