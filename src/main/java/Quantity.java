import java.util.Scanner;

public class Quantity {
    int quantity;
    private static final Scanner scanner = new Scanner(System.in);

    int getQuantity() {
        System.out.println("Привет! Я помогу вам с друзьями правильно разделить счёт.");

        while (true) {
            System.out.println("На скольких человек будем делить?");
            //После запуска программа должна спрашивать у пользователя, на скольких человек необходимо разделить счёт.
            if (scanner.hasNextInt()) {
                quantity = scanner.nextInt();
                if (quantity == 1) {
                    System.out.println("Сочувствую, что пришлось ужинать в одиночестве. Но мне так легче - делить ничего не нужно.");
                    System.out.println("Если вы всё-таки были с компанией - введите корректное количество людей.");

                } else if (quantity < 1) {
                    System.out.println("Не ужинал вообще никто? Введите корректное значение более 1");

                } else if (quantity > 1) {
                    System.out.println("Принято. Делим на " + quantity + ".");
                    return quantity;
                }
            } else {
                System.out.println("Введите корректное количество человек: целое число цифрой,больше 1");
                scanner.next();
            }
        }
    }
}