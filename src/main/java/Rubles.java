public class Rubles {
    String rub;


    public String getRub(float result)  {
       int floResult=(int) Math.floor(result);
            int preLastDigit = floResult % 100 / 10;
            if (preLastDigit == 1)
            {
                return "рублей";
            }

            switch (floResult % 10)
            {
                case 1:
                    return "рубль";
                case 2:
                case 3:
                case 4:
                    return "рубля";
                default:
                    return "рублей";
            }
        }


        // Сумма считается в рублях. Ваша задача — обработать правильный вывод.
        // Если сумма 1.45, то вы должны вывести "1.45 рубль",
        // а если сумма будет 3.20 или 4.00, вы должны вывести 3.20 рубля или 4.00 рубля.
        // Окончания в слове "рубль" должны зависеть от целочисленной части.
        // Для округления дробного числа в меньшую сторону можно использовать метод floor() класса Math.

    }

