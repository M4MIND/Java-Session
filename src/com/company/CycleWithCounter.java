package com.company;

public class CycleWithCounter {
    public static void main(String[] args) {
        // Определяем вес всех таблеток
        double weightTums[] = {0.052, 0.048, 0.052, 0.043, 0.050, 0.048, 0.049, 0.054, 0.048, 0.045};

        // Передаем данных в метод проверки
        checkWeight(weightTums);
    }

    public static void checkWeight(double[] array) {
        // Переменна для хрпнения суммы веса
        double sumWeight = 0;

        // Циклом складываем весь вес таблеток
        for (int i = 0; i < array.length; i++) {
            sumWeight += array[i];
        }

        // Ищем среднее занчение
        sumWeight = sumWeight / array.length;

        // Если попадает в диапазон допустимых норм
        if (sumWeight > (0.050 - (0.050 / 100 * 10)) && sumWeight < (0.050 + (0.050 / 100 * 10))) {
            System.out.println("Все ок. Вес таблеток: " + sumWeight);
        }
        // Вес перевалил за допустимую норму
        else {
            System.out.println("Что-то пошло не так");
        }
    }
}
