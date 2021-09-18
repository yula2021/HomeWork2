package com.company;

public class HomeWork2 {
    public static void main(String[] args) {
        /*Задание 1. Обнулить бит в нулевом разряде числа N.
        Остальные биты не должны изменить своё значение.
        Вывести на консоль в двоичном виде. */
        System.out.println("Задание 1.");
        int i = 0b1111;
        int result = i ^= 0b0001;
        System.out.println(Integer.toBinaryString(result));
        //способ №2:
        byte res = (byte) (~ 1 & i);
        System.out.println(Integer.toBinaryString(res));
        System.out.println();

        /*Задание 3. Установить первый бит числа N равным 1.
        Вывести результат на консоль в двоичном виде. */
        System.out.println("Задание 3.");
        int i_2 = 0b11001100;
        // используем операцию логического битового сложения:
        int result_2 = i_2 | 0b00000010;//setting the first bit of a number
        System.out.println(Integer.toBinaryString(result_2));
        //можно использовать составной оператор:
        int result_3 = i_2 |= 2;
        System.out.println(Integer.toBinaryString(result_3));
        System.out.println();

        /*Задание 5. Установить первый бит числа N равным 0.
        Вывести результат на консоль в двоичном виде. */
        System.out.println("Задание 5.");
        int i_5 = 0b01001110;
        int result_5 = i_5 ^= 0b0010;//invert the 1st bit of the number
        System.out.println(Integer.toBinaryString(result_5));
        //способ №2:
        byte res_5 = (byte) ((~ (1 << 1) & i_5));
        System.out.println(Integer.toBinaryString(res_5));
        System.out.println();

        /*Задание 7. Определить значение i-го бита числа N.
        Вывести результат на консоль в двоичном виде. */
        System.out.println("Задание 7.");
        int n = 55;
        //допустим надо определить значение бита во втором разряде числа
        System.out.println(Integer.toBinaryString(n));
        System.out.println((n & 0b00000100) > 0 ? '1' : '0');
        System.out.println();

        /*Задание 9. Определить, имеют ли числа M и N разные знаки,
        используя только побитовые и условные операторы. */
        System.out.println("Задание 9.");
        int m1 = -10;
        m1 = m1 >>> 31;//shift the sign bit of the variable m1 to the extreme right position
        System.out.println(m1);
        int n1 = 10;
        n1 = n1 >>> 31;//shift the sign bit of variable n1 to the extreme right position
        System.out.println(n1);
        if (m1 != n1)//compare signed bits
        System.out.println("Variables have different signs");
        else
            System.out.println("Variables have the same signs");
        System.out.println();

        /*Задание 11. Посчитать и вывести на консоль количество единичных битов в числе N.
         Вывести на консоль исходное число в двоичном виде и результат. */
        System.out.println("Задание 10.");
            int x = 22;
            System.out.println(Integer.toBinaryString(x));
            int count;
            for (count = 0; x > 0; ++count) {
                x &= x - 1;
            }
            System.out.println(count);

    }
}
