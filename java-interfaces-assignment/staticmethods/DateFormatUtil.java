package staticmethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatUtil {
    static String format(LocalDate date, String pattern) {
        if (date == null) return "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
        return date.format(fmt);
    }
}
