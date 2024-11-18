public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека больше или равен 18, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека меньше 18, то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице ниже 5 градусов,нужно надеть шапку");
        } else {
            System.out.println("На улице выше 5 градусов, можно идти без шапки!");
        }
        System.out.println("Задача 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость больше 60 км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость ниже 60 км/ч, то можно ездить спокойно!");
        }

        System.out.println("Задача 4");
        int years = 25;
        if (years >= 2 && years <= 6) {
            System.out.println(" Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("  Если человеку от 7 до 17 лет, то ему нужно ходить в школу");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете.");
        }
        if (years > 24) {
            System.out.println("Если человеку больше 24, то ему пора ходить на работу.");
        }


        System.out.println("Задача 5");
        int age1 = 16;
        if (age1 < 5) {
            System.out.println("Если возраст ребенка меньше 5 лет, он не может кататься на аттракционах.");
        }
        if (age1 >= 5 && age1 <= 14) {
            System.out.println("Если возраст ребенка больше 5 лет, но меньше 14 лет, то он может кататься только в сопровождении взрослого.");
        }
        if (age1 > 14) {
            System.out.println("Если возраст ребенка больше 14 лет, он может кататься без сопровождения взрослого.");
        }


        System.out.println("Задача 6");

        int place = 105;
        if (place >= 1 && place <= 60) {
            System.out.println("В вагоне имеются сидячие места.");
        } else if (place >= 61 && place <= 102) {
            System.out.println("В вагоне имеются стоячие места.");
        } else {
            System.out.println("В вагоне места отсутствуют.");

        }
        System.out.println("Задача 7");
        int one = 5;
        int two = -4;
        int three = -9;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше остальных");
        } else {
            System.out.println(" Число " + three + " больше остальных");
            {

            }
        }
    }
}

