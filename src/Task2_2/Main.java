package Task2_2;


/*Необходимо реализовать коллекцию, которая имеет фиксированный размер.

        Размер задаётся:

        по умолчанию 16
        по указанию пользователя.
        Размер коллекции после инициализации меняться не может.

        Каждый новый элемент добавляется в конец. После того, как количество элементов достигло максимума - при добавлении нового элемента коллекция "сдвигается" влево.

        1-й элемент удаляется, а каждый следующий смещается на один элемент влево.

        Результатом выполнения задания должен быть репозиторий с коллекцией, классом, тестирующим данную коллекцию, описанием задания и README файлом с инструкцией по запуску приложения*/
public class Main {



    public static void main(String[] args) {
        QueueHolder queueHolder = new QueueHolder();
        int decision;
        do {
            System.out.println("Maximum queue size is " + queueHolder.getQueueSize() + "\n" +
                    "Choose what to do: \n" +
                    "1) to change queue size;\n" +
                    "2) to add an element;\n" +
                    "3) to quit the program");
            decision = QueueHolder.getIntFromScanner();
            switch (decision) {
                case 1: {
                    queueHolder.changeQueueSize();
                    break;
                }

                case 2: {
                    queueHolder.addElement();
                    break;
                }
                case 3: {
                    System.out.println("Goodbye! Thanks for using my program!");
                    break;
                }
                default: {
                    System.out.println("Incorrect input! Please try again!");
                }
            }
        } while (decision != 3);

    }


}
