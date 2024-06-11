//Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого
// года) до заданного года включительно, не используя циклы. Напишите
// формулу, использующую только арифметические операторы.

import java.util.Scanner;

public class CoreJavaSolutions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(leapYearCount(x));
    }
    public static int leapYearCount(int year) {
        return (year/4)-(year/100)+(year/400);
    }
/*Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
Допустимая погрешность – 0.0001 (1E-4).*/
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 0.0001;
    }
/*Реализуйте метод, возвращающий true, если среди четырех его аргументов
ровно два истинны (любые). Составьте формулу с использованием булевых операторов.*/
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d)) | ((a ^ d) & (b ^ c));
    }
}

