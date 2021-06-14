package ru.geekbrains.lesson_2;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println(checkSum(10, 5)); //true
        System.out.println(checkSum(10, 11)); //false

        isPositive(10); // "Число положительное"
        isPositive(-20); // "Число отрицательное"

        System.out.println(isNegative(-5)); //true
        System.out.println(isNegative(30)); //false

        printString("GeekBrains", 5);

        System.out.println(isLeapYear(2005)); //false
        System.out.println(isLeapYear(1900)); //false
        System.out.println(isLeapYear(2000)); //true
        System.out.println(isLeapYear(2020)); //true

    }

    public static boolean checkSum(int a, int b) {
        if(a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositive(int a) {
        if(a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        if(a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printString(String text, int n) {

        while(n > 0) {
            System.out.println(text);
            /* Если надо в одну строку, то так:
            System.out.print(text + " "); */
            n--;
        }



    }

    public static boolean isLeapYear(int year) {

        if(year % 4 != 0) {

            return false;

        } else {

            if(year % 100 == 0 && year % 400 != 0) {
                return false;
            } else {
                return true;
            }

        }

        /* Короткая запись
        if( year % 4 != 0 || (year % 100 == 0 && year % 400 != 0) ) return false;
        return true;
         */

        /* Ещё короче
         return ( year % 4 != 0 || (year % 100 == 0 && year % 400 != 0) ) ? false : true;
        */

    }

}
