package org.example.gamehub;

import org.example.gamehub.game.GuessNumberGame;
import org.example.gamehub.game.Randomizer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GuessNumberGame guessNumberGame = new GuessNumberGame();
        Randomizer randomizerGame = new Randomizer();

        boolean running = true;

        System.out.println("==============================");
        System.out.println("          GAMEHUB");
        System.out.println("==============================");

        while (running) {
            System.out.println();
            System.out.println("Выбери игру:");
            System.out.println("1. Угадай число");
            System.out.println("2. Рандомайзер");
            System.out.println("3. Выход");
            System.out.print("Твой выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    guessNumberGame.play();
                    break;

                case 2:
                    randomizerGame.play();
                    break;

                case 3:
                    running = false;
                    System.out.println("Спасибо за игру! До встречи!");
                    break;

                default:
                    System.out.println("Такого пункта нет. Попробуй ещё раз.");
            }
        }

        scanner.close();
    }
}