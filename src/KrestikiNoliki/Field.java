package KrestikiNoliki;


class Field {

    private static String[] mas = new String[9];
    String[] getMas(){
        return mas;
    }
    void getField(){
        System.out.println("-------------");
        System.out.println("| " + mas[0] + " | " + mas[1] + " | " + mas[2] + " |");
        System.out.println("-------------");
        System.out.println("| " + mas[3] + " | " + mas[4] + " | " + mas[5] + " |");
        System.out.println("-------------");
        System.out.println("| " + mas[6] + " | " + mas[7] + " | " + mas[8] + " |");
        System.out.println("-------------");
    }
    void setField(){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.toString(i);
        }
    }
}
