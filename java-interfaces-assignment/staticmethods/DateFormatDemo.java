package staticmethods;

import java.time.LocalDate;

public class DateFormatDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2025, 8, 28);
        System.out.println(DateFormatUtil.format(today, "dd-MM-yyyy"));
        System.out.println(DateFormatUtil.format(today, "yyyy/MM/dd"));
        System.out.println(DateFormatUtil.format(today, "EEE, dd MMM uuuu"));
    }
}
