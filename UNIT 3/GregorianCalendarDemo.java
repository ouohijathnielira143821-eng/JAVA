import java.util.GregorianCalendar;

class GregorianCalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println("Current Date: " + gc.getTime());
        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (gc.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Hour: " + gc.get(GregorianCalendar.HOUR));
        System.out.println("Minute: " + gc.get(GregorianCalendar.MINUTE));
        System.out.println("Second: " + gc.get(GregorianCalendar.SECOND));

        System.out.println("Leap Year: " +
            gc.isLeapYear(gc.get(GregorianCalendar.YEAR)));

        System.out.println("Day of Week: " +
            gc.get(GregorianCalendar.DAY_OF_WEEK));

        System.out.println("Day of Year: " +
            gc.get(GregorianCalendar.DAY_OF_YEAR));
    }
}