package Task1_2;

public class ArrayHolder {
    private static int[] mas;

    public ArrayHolder(int arraySize) {
        this.mas = new int[arraySize];
    }


    public int[] getMas() {
        return mas;
    }

    public void sortArrayInAscending() {
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

    public void sortArrayInDescending() {
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

    public String findElement(int element) {
        String string = "";
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == element) {
                string += i + ", ";
            }
        }
        return string;
    }

    public void fillArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10 + 1);
        }
    }
}

