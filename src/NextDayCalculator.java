public class NextDayCalculator {
    public static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400)
                    return true;
            } else {
                return true;
            }
        }
        return false;
    }

    public static String NextDay(int day, int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    if (day == 29) {
                        day = 1;
                        month += 1;
                        return "Next day: " + day + "/" + month + "/" + year;
                    } else if (day > 0 && day < 29){
                        day += 1;
                        return "Next day: " + day + "/" + month + "/" + year;
                    }else {
                        return "số ngày không hợp lệ"
                    }
                } else {
                    if (day == 28) {
                        day = 1;
                        month += 1;
                        return "Next day: " + day + "/" + month + "/" + year;
                    }else if (day > 0 && day < 28){
                        day += 1;
                        return "Next day: " + day + "/" + month + "/" + year;
                    }else {
                        return "số ngày không hợp lệ"
                    }
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                } else if (day > 0 && day < 31){
                    day += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                }else {
                    return "số ngày không hợp lệ"
                }

            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                } else if (day > 0 && day < 30){
                    day += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                }else {
                    return "số ngày không hợp lệ"
                }

            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                } else if (day > 0 && day < 31){
                    day += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                }else {
                    return "số ngày không hợp lệ"
                }

        }
        return "";
    }
}
