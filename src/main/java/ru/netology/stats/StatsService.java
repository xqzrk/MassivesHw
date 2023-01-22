package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long salesSummary(long[] sales) {
        long lastMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            lastMonth = lastMonth + sales[i];
        }
        return lastMonth;
    }

    public long salesAverage(long[] sales) {
        long lastMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            lastMonth = lastMonth + sales[i];
        }
        long averageSales = lastMonth / sales.length;
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long salesBeyondAverage(long[] sales) {
        long lastMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            lastMonth = lastMonth + sales[i];
        }
        long averageSales = lastMonth / sales.length;
        int beyoundAverage = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            if (sales[i] < averageSales) {
                beyoundAverage = beyoundAverage + 1;
            }
        }
        return beyoundAverage;
    }

    public long salesAboveAverage(long[] sales) {
        long lastMonth = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            lastMonth = lastMonth + sales[i];
        }
        long averageSales = lastMonth / sales.length;
        int aboveAverage = 0;
        for (int i = 0; i < sales.length; i = i + 1) {
            if (sales[i] < averageSales) {
                aboveAverage = aboveAverage + 1;
            }
        }
        return aboveAverage;
    }
}