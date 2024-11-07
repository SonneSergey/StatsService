package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Сумма всех продаж: " + service.sumSales(sales));
        System.out.println("Средняя сумма продаж в месяц: " + service.averageSales(sales));
        System.out.println("Месяц с максимальными продажами: " + service.maxSalesMonth(sales));
        System.out.println("Месяц с минимальными продажами: " + service.minSalesMonth(sales));
        System.out.println("Количество месяцев с продажами ниже среднего: " + service.monthsBelowAverage(sales));
        System.out.println("Количество месяцев с продажами выше среднего: " + service.monthsAboveAverage(sales));
    }
}
