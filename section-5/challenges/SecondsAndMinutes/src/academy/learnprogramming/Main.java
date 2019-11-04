package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3800));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = (minutes / 60);
        int remainingMinutes = (minutes % 60);

        return format(hours) + "h " + format(remainingMinutes) + "m " + format(seconds) + "s";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    private static String format(int value) {
        if (value < 10) {
            return "0" + value;
        }

        return String.valueOf(value);
    }
}
