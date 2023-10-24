package pl.sda.mg.java11;

public class MonthService {

    public static String getMonthName(int monthNumber) {
        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "Styczeń";
                break;
            case 2:
                monthName = "Luty";
                break;
            case 3:
                monthName = "Marzec";
                break;
            case 4:
                monthName = "Kwiecień";
                break;
            case 5:
                monthName = "Maj";
                break;
            case 6:
                monthName = "Czerwiec";
                break;
            case 7:
                monthName = "Lipiec";
                break;
            case 8:
                monthName = "Sierpień";
                break;
            case 9:
                monthName = "Wrzesień";
                break;
            case 10:
                monthName = "Październik";
                break;
            case 11:
                monthName = "Listopad";
                break;
            case 12:
                monthName = "Grudzień";
                break;
            default:
                monthName = "Nieprawidłowy numer miesiąca";
                break;
        }

        return monthName;
    }

    public static String getMonthsWithSwitchExpression(int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "Styczeń";
            case 2 -> "Luty";
            case 3 -> "Marzec";
            case 4 -> "Kwiecień";
            case 5 -> "Maj";
            case 6 -> "Czerwiec";
            case 7 -> "Lipiec";
            case 8 -> "Sierpień";
            case 9 -> "Wrzesień";
            case 10 -> "Październik";
            case 11 -> "Listopad";
            case 12 -> "Grudzień";
            default -> "Nieprawidłowy numer miesiąca";
        };
    }
}
