package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcRestServiceTest {
    @Test
    public void CalcRestServiceTest1() {
        CalcRestService service = new CalcRestService();

        int income = 10_000;
        int expence = 3_000;
        int thresholder = 20_000;

        int expected = 3;
        int actual = service.calculate(income, expence, thresholder);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CalcRestServiceTest2() {
        CalcRestService service = new CalcRestService();

        int income = 100_000;
        int expence = 60_000;
        int thresholder = 150_000;

        int expected = 2;
        int actual = service.calculate(income, expence, thresholder);

        Assertions.assertEquals(expected, actual);
    }

}
