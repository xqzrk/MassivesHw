import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println("Сумма всех продаж - " + service.salesSummary( sales));
        System.out.println("В среднем продажи за месяц - " + service.salesAverage(sales));
        System.out.println("Наибольшие продажи в месяц №" + service.maxSales(sales));
        System.out.println("Наименьшие продажи в месяц №" + service.minSales(sales));
        System.out.println("Количество месяцев с продажами ниже среднего - " + service.salesBeyondAverage(sales));
        System.out.println("Количество месяцев с продажами выше среднего - " + service.salesAboveAverage(sales));
    }

}
