package com.company;

public class PostconditionLoop {
    public static void main(String[] args) {
        // Определяем вес всех таблеток
        double arr[] = {0.052, 0.048, 0.052, 0.043, 0.050, 0.048, 0.049, 0.054, 0.048, 0.045};

        // Передаем данных в метод проверки
        checkWeight(arr);
    }

    public static void checkWeight (double[] array) {
        // Счетчик
        int count = -1;

        // Переменна для хрпнения суммы веса
        double sumWeight = 0;

        // Циклом складываем весь вес таблеток пока счетчик не станет больше чем количество таблеток
        while (count ++ < array.length - 1)
            sumWeight += array[count];

        // Ищем среднее значение
        sumWeight = sumWeight / array.length;

        // Если попадает в диапазон допустимых норм
        if (sumWeight > (0.050 - (0.050 / 100 * 10)) && sumWeight < (0.050 + (0.050 / 100 * 10))) {
            System.out.println("Все ок. Вес: " + sumWeight);
        }
        // Вес перевалил за допустимую норму
        else {
            System.out.println("Что-то пошло не так");
        }
    }
}
