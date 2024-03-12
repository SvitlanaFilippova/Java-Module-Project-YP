import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Quantity quantity = new Quantity();
        int people=quantity.getQuantity();

        Calculator calculator = new Calculator();
        float result = calculator.calculate(people);

        String rub = "рублей"; //определить окончание для сообщения о результате, в зависимости от получившейся суммы

        System.out.printf("Делим на %d. С каждого человека по %.2f %s.%n", people, result, rub); //Допилить, чтобы было разное собщение в зависимости от суммы
        //Окончания в слове "рубль" должны зависеть от целочисленной части. 1 рубль, 3 рубля, 5 рублей.... и тд
    }


}





