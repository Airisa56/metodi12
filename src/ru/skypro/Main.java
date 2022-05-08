package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1

        yearVic(2016);
        yearVic(2018);
        system ('a', 2015 );
        system ( 'i', 2015) ;
        int day = bankDistance (95);
        int day2 = bankDistance( 110);
        System.out.println(day2);
        System.out.println( day);
    }

    public static void yearVic(int year) {
        if (year % 400 == 0) {
            System.out.println("весокосный год" + year);
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("весокосный год" + year);
        } else {
            System.out.println("не весокосный год" + year);
        }

    }

    public static void system(char operSystem, int clientDeviceYear) {
        if (operSystem == 'a' && clientDeviceYear < 2015) {
            System.out.println(" Операционная система Андроид");
            System.out.println(" Установите облегченную версию для Андроид по ссылке");
        } else if (operSystem == 'a' && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println(" Операционная система Андроид ");
            System.out.println(" Установите приложение");

        } else if (operSystem == 'i' && clientDeviceYear < 2015) {
            System.out.println(" Операционная система IOS ");
            System.out.println(" Установите облегченную версию для IOS по ссылке");
        } else if (operSystem == 'i' && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println(" Операционная система IOS");
            System.out.println(" Установите приложение");
        }

    }
    public static int bankDistance ( int deliveryDistance ) {
        int count = 1;
        while ( deliveryDistance > 20 ) {
            count++ ;
            deliveryDistance -= 40 ;


        }
        return count ;


    }

}


