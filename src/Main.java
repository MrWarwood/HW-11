public class Main {
    public static void main(String[] args) {
        System.out.println("HW 11");
        System.out.println();
        System.out.println("Задача №1.");
        int yearToCheck = 2003;
        checkLearYear(yearToCheck);
    }

    public static void checkLearYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "  год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }

        System.out.println();
        System.out.println("Задача №2.");
        int clientDeviceOs = 0;
        int clientDeviceYear = 2015;
        checkDeviceClient(clientDeviceOs, clientDeviceYear);
    }

    public static void checkDeviceClient(int deviceOs, int deviceYear) {
        if (deviceOs == 0) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (deviceOs == 1) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Указана не правильная операцинная система");
        }

        System.out.println();
        System.out.println("Задача №3.");
        int deliveryDistance = 5;
        distanceTime(deliveryDistance);
    }
    public static void distanceTime(int km) {
        if (km <= 20) {
            System.out.println("Потребуется дней:1, срок доставки.");
        } else if (km > 20 && km < 60) {
            System.out.println("Потребуется дней:2, срок доставки.");
        } else if (km >= 60 && km < 100) {
            System.out.println("Потребуется дней:3, срок доставки.");
        } else if (km >= 100) {
            System.out.println("доставки нет.");
        }
    }
}







