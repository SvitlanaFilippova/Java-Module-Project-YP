import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    public static float calculate(int people) {
        System.out.println("Ок, теперь добавим в счёт товары");

        ArrayList<Good> goodsList = new ArrayList<>(); //создала список, где будем хранить все введённые товары
        float sum = 0;
        float result;

        while (true) {
            System.out.println("Введите название товара, чтобы добавить его...");
            String goodName = scanner.next();

            System.out.println("Введите стоимость товара в формате 'рубли.копейки', например 10.15...");
            while (true) {
                if (scanner.hasNextFloat()) {
                    float price = scanner.nextFloat();
                    if (price <= 0) {
                        System.out.println("Введите корректную стоимость товара, больше 0");
                    } else {
                        sum += price;
                        Good newGood = new Good(goodName, price);//создала новый обьект Товар
                        goodsList.add(newGood);//добавила товар в список
                        System.out.println("Товар успешно добавлен! Хотите добавить ещё товар? " +
                                "Введите любой символ, чтобы продолжить, или 'завершить', чтобы закончить добавление товаров...");
                        break;
                    }
                } else {
                        System.out.println("Введите корректную стоимость товара цифрой");
                    scanner.next();


                }
            } //конец бесконечного цикла на запрос цены




                String whatToDo = scanner.next();
                if (whatToDo.equalsIgnoreCase("Завершить")) {
                    System.out.println("Добавленные товары:");
                    Rubles rubles = new Rubles();


                    for (Good good : goodsList) {
                        String rub=rubles.getRub(good.price);
                        System.out.printf("%s стоимостью %.2f %s \n", good.name, good.price, rub); //вот тут изменить руб на динамическое окончание
                    }

                    result = sum / people;
                    break;
                }

            }
        return (result);
        }

    }
