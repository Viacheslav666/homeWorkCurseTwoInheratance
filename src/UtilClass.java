public class UtilClass {
    public static String checkingError(String value, String def) {
        if (value == null || value.isEmpty()) {
            return def;
        }
        return value;
    }
    public static int checkingErrorInt(int value, int def) {
        if (value == 0 || value<0 ) {
            return 60;
        }
        return value;
    }
}