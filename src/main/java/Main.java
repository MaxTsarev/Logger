import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static List<Integer> getArrayList(int input, int input2) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            list.add(random.nextInt(input2));
        }
        return list;
    }

    public static void filter(List<Integer> list, Logger logger, int input3) {
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (value >= input3) {
                logger.log("Элемент " + value + " подходит");
            } else {
                logger.log("Элемент " + value + " не подходит");
            }
        }
    }


    public static void main(String[] args) {

        List<Integer> list;
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();


        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int input = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int input2 = scanner.nextInt();

        logger.log("Создаем и наполняем список");
        list = getArrayList(input, input2);
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int input3 = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        filter(list, logger, input3);
        Filter filter = new Filter(input3);
        list = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + list);

        logger.log("Завершаем программу");
    }
}
