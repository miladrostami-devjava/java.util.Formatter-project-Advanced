package ir.formatter.formattableflags;

import java.util.Formatter;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        CustomDate customDate = new CustomDate(1992,04,05);

        Formatter formatter = new Formatter();
        formatter.format("%s",customDate);
        System.out.println(formatter);

        // Formatting with the ALTERNATE flag
formatter = new Formatter();
formatter.format(Locale.FRENCH,"%#s",customDate);
        System.out.println(formatter);



    }
}
