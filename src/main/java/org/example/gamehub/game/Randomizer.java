package org.example.gamehub.game;

import java.util.Random;
import java.util.Scanner;

public class Randomizer implements Game {

    @Override
    public String getName() {
        return "Рандомайзер";
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n=== РАНДОМАЙЗЕР ===");

        System.out.print("Введи минимальное число: ");
        int min = scanner.nextInt();

        System.out.print("Введи максимальное число: ");
        int max = scanner.nextInt();

        if (min > max) {
            System.out.println("Ошибка! Минимальное число не может быть больше максимального.");
            return;
        }

        int result = random.nextInt(max - min + 1) + min;

        System.out.println("Случайное число: " + result);
    }
}