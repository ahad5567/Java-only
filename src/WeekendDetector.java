import java.util.Scanner;

public class WeekendDetector {
    public static void main(String[] args) {
        String day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        day = scanner.next();

        switch (day) {
            default -> System.out.println(day + " is not a day");
            case "Sunday" -> System.out.println(day + " is a weekday \uD83D\uDE29");
            case "Monday" -> System.out.println(day + " is a weekday \uD83D\uDE29");
            case "Tuesday" -> System.out.println(day + " is a weekday \uD83D\uDE29");
            case "Wednessday" -> System.out.println(day + " is a weekday \uD83D\uDE29");
            case "Thuesday" -> System.out.println(day + " is a weekday \uD83D\uDE29");
            case "Friday" -> System.out.println(day + " is the weekend \uD83D\uDE00");
            case "Saturday" -> System.out.println(day + " is the weekend \uD83D\uDE00");

        }

        /*
         * You can do this also:
         * switch (day) {
         * default -> System.out.println(day + " is not a day");
         * 
         * case "Sunday", "Monday","Tuesday","Wednessday","Thuesday"->
         * System.out.println(day + " is a weekday \uD83D\uDE29");
         * 
         * case "Friday", "Saturday" -> System.out.println(day +
         * " is the weekend \uD83D\uDE00");
         * 
         * }
         */
        scanner.close();
    }
}