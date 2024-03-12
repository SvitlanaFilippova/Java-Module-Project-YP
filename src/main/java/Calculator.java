import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    public static float calculate(int people) {
        System.out.println("Ок, теперь добавим в счёт товары");

        ArrayList<Good> goodsList = new ArrayList<>(); //создала список, где будем хранить все введённые товары
        float sum = 0;
        float result = 0;

        while (true) {
            System.out.println("Введите название товара, чтобы добавить его...");
            String goodName = scanner.next();

            System.out.println("Введите стоимость товара в формате 'рубли.копейки', например 10.15...");
            while (true) {
                if (scanner.hasNextFloat()) { // хочется добавить ещё проверку на отрицательные числа, но не пойму, как правильно.
                    // Если так: &&(scanner.nextFloat()>0) , то сканнер ждёт новое введение цены. Не круто.

                    float price = scanner.nextFloat();
                    sum += price;
                    Good newGood = new Good(goodName, price);//создала новый обьект Товар
                    goodsList.add(newGood);//добавила товар в список
                    System.out.println("Товар успешно добавлен! Хотите добавить ещё товар? " +
                            "Введите любой символ, чтобы продолжить, или 'завершить', чтобы закончить добавление товаров...");
                    break;
                }
                else {
                    System.out.println ("Введите корректную стоимость товара");
                    scanner.next();
                }
            } //конец бесконечного цикла на запрос цены




                String whatToDo = scanner.next();
                if (whatToDo.equalsIgnoreCase("Завершить")) {
                    System.out.println("Добавленные товары:");
                    for (Good good : goodsList) {
                        System.out.println(good.name + " стоимостью " + good.price + "руб.");
                    }

                    result = sum / people;
                    break;
                }

            }
        return (result);
        }

    }
