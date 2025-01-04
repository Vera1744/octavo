package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restMonth.csv")
    public void CalcRestServiceTest1(int income, int expense, int thresholder, int expected) {
        CalcRestService service = new CalcRestService();

        //int income = 10_000;
        //int expense = 3_000;
        //int thresholder = 20_000;

        //int expected = 3;
        int actual = service.calculate(income, expense, thresholder);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
    // public void CalcRestServiceTest2() {
//        CalcRestService service = new CalcRestService();
//
//        int income = 100_000;
//        int expence = 60_000;
//        int thresholder = 150_000;
//
//        int expected = 2;
//        int actual = service.calculate(income, expence, thresholder);
//
//        Assertions.assertEquals(expected, actual);
//    }

}
