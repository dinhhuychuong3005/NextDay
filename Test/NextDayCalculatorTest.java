import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {

    @Test
    void nextDay() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "Next day: " + 1 + "/" + 2 + "/" + 2018;
        String result = NextDayCalculator.NextDay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    void nextDay1() {
        int day = 29;
        int month = 2;
        int year = 2020;

        String expected = "Next day: " + 1 + "/" + 3 + "/" + 2020;
        String result = NextDayCalculator.NextDay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    void nextDay3() {
        int day = 31;
        int month = 12;
        int year = 2018;

        String expected = "Next day: " + 1 + "/" + 1 + "/" + 2019;
        String result = NextDayCalculator.NextDay(day,month,year);
        assertEquals(expected,result);
    }
}