package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        //банк считывает пополнения и списание и делал анализ
        Scanner in = new Scanner(System.in);
        int popolnenie = 0;
        int spisanie = 0;
        int a;
        int b;
        while (true){
            System.out.println("Ввыберите действия:\n 0-Баланс\n 1-Списание средств \n 2-Пополнение средств\n 3-Анализ за месяц\n 4-Общий анализ");
            int move =Integer.parseInt(in.nextLine());
            if (move == 1)
            {
                System.out.println("Введите сумму списание средств: ");
                spisanie = Integer.parseInt(in.nextLine());
            }
            else if (move == 2)
            {
                System.out.println("Введите сумму пополнение средств: ");
                popolnenie = Integer.parseInt(in.nextLine());
            }
            else if (move == 3)
            {
                a = popolnenie / 30;
                b = spisanie / 30;

                System.out.println("Анализ пополнений за месяц: " + a);
                System.out.println("Анализ списания за месяц: " + b);
            }
            else if (move == 4)
            {
                System.out.println("Анализ пополнения за все время: "+ popolnenie);
                System.out.println("Анализ списания за все время: "+ spisanie);
            }
            else if (move == 0)
            {
                System.out.println("Баланс: " + popolnenie);
            }
        }

    }
}
