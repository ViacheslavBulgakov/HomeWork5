public class Main {
    public static void main(String[] args) {

        System.out.println("    Задание1");

        int clientOS = 1; // для Android - 1, для IOS - 0
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("    Задание2");

        int deviceYear = 2015; // Ключевая дата выпуска телефонов, от которой зависит OS
        int clientDeviceYear = 2014; // Дата выпуска телефона клиента
        if (clientOS == 1) {
            if (clientDeviceYear < deviceYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear < deviceYear) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }

        System.out.println("    Задание3");

        int year = 2024;
        if (year < 1584) {
            System.out.println("До 1584 года в календарь не был введён високосный год.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("    Задание4");

        int deliveryDistance = 95;
        int timeDelivery = 0;
        if (deliveryDistance < 20) {
            timeDelivery = 1;
            System.out.println("Для доставки карты потребуется " + timeDelivery + " день." );
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            timeDelivery = 2;
            System.out.println("Для доставки карты потребуется " + timeDelivery + " дня." );
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            timeDelivery = 3;
            System.out.println("Для доставки карты потребуется " + timeDelivery + " дня." );
        } else {
            System.out.println("Доставки нет." );
        }

        System.out.println("    Задание5");

        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-ый месяц года (он же январь) принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(monthNumber + "-ой месяц года (он же февраль) принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(monthNumber + "-ий месяц года (он же март) принадлежит к сезону весна");
                break;
            case 4:
                System.out.println(monthNumber + "-ый месяц года (он же апрель) принадлежит к сезону весна");
                break;
            case 5:
                System.out.println(monthNumber + "-ый месяц года (он же май) принадлежит к сезону весна");
                break;
            case 6:
                System.out.println(monthNumber + "-ой месяц года (он же июнь) принадлежит к сезону лето");
                break;
            case 7:
                System.out.println(monthNumber + "-ой месяц года (он же июль) принадлежит к сезону лето");
                break;
            case 8:
                System.out.println(monthNumber + "-ой месяц года (он же август) принадлежит к сезону лето");
                break;
            case 9:
                System.out.println(monthNumber + "-ый месяц года (он же сентябрь) принадлежит к сезону осень");
                break;
            case 10:
                System.out.println(monthNumber + "-ый месяц года (он же октябрь) принадлежит к сезону осень");
                break;
            case 11:
                System.out.println(monthNumber + "-ый месяц года (он же ноябрь) принадлежит к сезону осень");
                break;
            case 12:
                System.out.println(monthNumber + "-ый месяц года (он же декабрь) принадлежит к сезону зима");
                break;
            default:
                System.out.println("В году всего 12 месяцев!");
        }

    }
}