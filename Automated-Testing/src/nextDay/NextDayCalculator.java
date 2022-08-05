package nextDay;

public class NextDayCalculator {
    public static boolean checkLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public static int getFullDay(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (checkLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return -1;
        }
    }
    public static String getNextDay(int day, int month, int year){
        if(day==getFullDay(month,year)){
            if(month==12){
                year=year+1;
                month=1;
                day=1;
            }else {
                month=month+1;
                day=1;
            }
            return day+"/"+month+"/"+year;
        } else {
            day=day+1;
            return day+"/"+month+"/"+year;
        }
    }
}
