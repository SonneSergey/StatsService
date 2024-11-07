package ru.netology.stats;
public class StatsService {

    // Метод для расчета общей суммы всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;// Начальная сумма — 0
        for (long sale : sales) { // Проходим по всем элементам массива продаж
            sum += sale; // Увеличиваем sum на размер очередного элемента массива.
        }
        return sum;
    }

    // Метод для расчета средней суммы продаж в месяц
    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;// Делим общую сумму продаж на количество элементов массива
    }

    // Метод для определения месяца с максимальными продажами
    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0; // Инициализируем месяц с максимальными продажами
        for (int i = 0; i < sales.length; i++) { // Проверяем каждый месяц
            if (sales[i] >= sales[maxMonth]) { // Если текущая продажа равна или выше текущего максимума
                maxMonth = i; // Обновляем месяц с максимальными продажами
            }
        }
        return maxMonth + 1; // Возвращаем номер месяца
    }

    // Метод для определения номера месяца с минимальными продажами
    public int minSalesMonth(long[] sales) {
        int minMonth = 0; // Инициализируем месяц с минимальными продажами
        for (int i = 0; i < sales.length; i++) { // Проверяем каждый месяц
            if (sales[i] <= sales[minMonth]) { // Если текущая продажа равна или выше текущего минимума
                minMonth = i;// Обновляем месяц с минимальными продажамими
            }
        }
        return minMonth + 1; // Возвращаем номер месяца
    }

    // Метод для подсчета месяцев с продажами ниже среднего уровня
    public int monthsBelowAverage(long[] sales) {
        long average = averageSales(sales); // Находим среднюю сумму продаж
        int count = 0; // Инициализируем счетчик месяца с продажами ниже среднего
        for (long sale : sales) { // Проверяем каждый месяц
            if (sale < average) { // Если продажи в месяце меньше среднего
                count++; // Увеличиваем счетчик
            }
        }
        return count; // Возвращаем количество месяцев с продажами ниже среднего
    }

    // Метод для подсчета месяцев с продажами выше среднего уровня
    public int monthsAboveAverage(long[] sales) {
        long average = averageSales(sales); // Находим среднюю сумму продаж
        int count = 0; // Инициализируем счетчик месяца с продажами выше среднего
        for (long sale : sales) {  // Проверяем каждый месяц
            if (sale > average) { // Если продажи в месяце выше среднего
                count++; // Увеличиваем счетчик
            }
        }
        return count; // Возвращаем количество месяцев с продажами выше среднего
    }
}