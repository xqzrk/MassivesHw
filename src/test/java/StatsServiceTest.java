import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void testSummary() {
        StatsService service = new StatsService();
        int expected = 180;
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long actual = service.salesSummary(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();
        int expected = 15;
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long actual = service.salesAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMaxSalesMonthNumber() {
        StatsService service = new StatsService();
        int expected = 8;
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinSalesMonthNumber() {
        StatsService service = new StatsService();
        int expected = 9;
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testBeyoundAverageMonths() {
        StatsService service = new StatsService();
        int expected = 5;
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long actual = service.salesBeyondAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAboveAverageMonths() {
        StatsService service = new StatsService();
        int expected = 5;
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long actual = service.salesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
