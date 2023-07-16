
import java.util.Scanner;

public class WorkDayCountDown {
    public static void main(String[] args) {
        // Генерируем случайное число от 0 до 28800 (включительно)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько осталось секунд? ");
        int n = scanner.nextInt();
        if (n < 0){
            System.out.println("Введите положительное число");
            System.exit(1);
        }
        else if (n > 28800){
            System.out.println("Это более 8 часов");
            System.exit(2);
        }

        // Выводим число секунд
        System.out.println("Осталось секунд: " + n);

        // Вычисляем количество часов
        int hours = n / 3600;

        // Выводим информацию о количестве полных часов
        if (hours >= 5) {
            System.out.println("Осталось " + hours + " часов");
        } else if (hours > 1 && hours < 5) {
            System.out.println("Осталось " + hours + " часa");
        } else if (hours == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}

