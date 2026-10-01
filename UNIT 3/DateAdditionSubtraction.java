import java.util.Calendar;

class DateAdditionSubtraction {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("Current Date and Time: " + c.getTime());

        // Add 5 days
        c.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After Adding 5 Days: " + c.getTime());

        // Subtract 5 days
        c.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("After Subtracting 5 Days: " + c.getTime());

        // Add 2 months
        c.add(Calendar.MONTH, 2);
        System.out.println("After Adding 2 Months: " + c.getTime());

        // Subtract 2 months
        c.add(Calendar.MONTH, -2);
        System.out.println("After Subtracting 2 Months: " + c.getTime());
    }
}