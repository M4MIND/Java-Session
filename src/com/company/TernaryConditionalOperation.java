package com.company;

public class TernaryConditionalOperation {

    public static void main(String[] args) {

        // Проверка на количество аргументов переданных программе
        // И если первый аргумент равен -u
        if (args.length > 0 && args[0].equals("-u")) {
            System.out.println("Hello, " +System.getProperty("user.name") + "!");
        }

        System.out.println("Hello!");
    }
}
