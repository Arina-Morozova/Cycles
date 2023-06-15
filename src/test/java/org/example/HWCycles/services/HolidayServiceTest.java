package org.example.HWCycles.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

    public class HolidayServiceTest {
        @Test
        void shouldCalculateForLowIncome() {
            HolidayService service = new HolidayService();

            // подготавливаем данные:
            int income = 10_000;
            int expenses = 3_000;
            int threshold = 20_000;
            long expected = 3;

            // вызываем целевой метод:
            long actual = service.calculate(income, expenses, threshold);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForHighIncome() {
            HolidayService service = new HolidayService();

            // подготавливаем данные:
            int income = 100_000;
            int expenses = 60_000;
            int threshold = 150_000;
            long expected = 2;

            // вызываем целевой метод:
            long actual = service.calculate(income, expenses, threshold);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }
    }