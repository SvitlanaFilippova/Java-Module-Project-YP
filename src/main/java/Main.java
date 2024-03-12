public class Main {

    public static void main(String[] args) {

        Quantity quantity = new Quantity();
        int people=quantity.getQuantity();

        Calculator calculator = new Calculator();
        float result = calculator.calculate(people);

        Rubles rubles = new Rubles();
        String rub=rubles.getRub(result);


        System.out.printf("Делим на %d. С каждого человека: %.2f %s.%n", people, result, rub);
    }


}





