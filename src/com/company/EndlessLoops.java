package com.company;

import java.util.Scanner;

public class EndlessLoops {
    public static void main(String[] args) {
        // Бесконечный цикл
        while (true) {
            switch (getUserInput()) {
                case 1, 4, 7 -> System.out.println("По вашему вопросу обратитесь в окно 26");
                case 2, 3, 5, 6 -> System.out.println("По вашему вопросу обратитесь в окно 27");
                case 8, 9, 10 -> System.out.println("По вашему вопросу обратитесь в окно 28");
                default -> System.out.println("По вашему вопросу обратитесь в окно 30");
            }

        }
    }

    static Scanner in = new Scanner(System.in);

    private static int getUserInput() {
        return in.nextInt();
    }
}
