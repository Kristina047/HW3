public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний!");
        } else {
            System.out.println("Ты несовершеннолетний, нужно немного подождать.");
        }

        System.out.println("Задача 2");
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице холодно,нужно надеть шапку.");
        } else {
            System.out.println("На улице тепло, можно идти без шапки!");
        }
        System.out.println("Задача 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Придется платить штраф.");
        } else {
            System.out.println("Можно ездить спокойно!");
        }



    }
}