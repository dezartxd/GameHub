package org.example.gamehub.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame implements Game{

    @Override
    public String getName() {
        return "Угадай число";
    }

    @Override
    public void play() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Я загадал число от 1 до 100.");
        System.out.println("Попробуй его угадать!");

        while (guess != secretNumber) {
            System.out.print("Введи число: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Загаданное число больше!");
            } else if (guess > secretNumber) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("Правильно! Ты угадал!");
            }
        }
    }
}
