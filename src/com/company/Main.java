package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий курс конвертации Руб/$: ");
        double rate = in.nextDouble();
        System.out.print("Введите сумму в рублях: ");
        double sum = in.nextDouble();
        System.out.printf("Сумма в долларах: %.2f\n", sum*rate);
    }
}
