import java.util.Date;

public class Main {
    public static void call(Class cls, String methodName) throws Exception {
        cls.getDeclaredMethod(methodName).invoke(null);
    }

    public static void main(String[] args) {
        var tasksCount = 8;
        for (var i = 1; i <= tasksCount; i++) {
            try {
                call(Main.class, "task" + i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int income = 0, deposit = 15000, target = 2459000, monthsCount = 0;
        while (income < target) {
            income += deposit;
            monthsCount += 1;
            System.out.println("Месяц " + monthsCount + ", сумма накоплений равна " + income + " рублей");
        }
        System.out.println(monthsCount);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        i--;
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        double addPopulation = 0.007, subPopulation = 0.008;
        for (int i = 1; i <= 10; i++) {
            population += population * addPopulation;
            population -= population * subPopulation;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int income = 15000, target = 12000000, monthsCount = 0;
        double addIncome = 0.07;
        while (income < target) {
            income += income * addIncome;
            monthsCount += 1;
            System.out.println("Месяц " + monthsCount + ", сумма накоплений равна " + income + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int income = 15000, target = 12000000, monthsCount = 0;
        double addIncome = 0.07;
        while (income < target) {
            income += income * addIncome;
            monthsCount += 1;
            if (monthsCount % 6 == 0) {
                System.out.println("Месяц " + monthsCount + ", сумма накоплений равна " + income + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int income = 15000, monthsCount = 0;
        double addIncome = 0.07;
        while (monthsCount < 12 * 9) {
            income += income * addIncome;
            monthsCount += 1;
            if (monthsCount % 6 == 0) {
                System.out.println("Месяц " + monthsCount + ", сумма накоплений равна " + income + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 5;

        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        for (int i = 2023 - 200; i <= 2023 + 100; i++) {
            if (i % 79 == 0)
                System.out.println(i);
        }
    }
}