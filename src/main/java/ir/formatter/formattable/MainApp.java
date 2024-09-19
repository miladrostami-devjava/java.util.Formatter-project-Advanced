package ir.formatter.formattable;

import java.util.Formatter;
import java.util.Locale;

public class MainApp {
    public static void main(String[] args) {

        Person person = new Person(78,"milad","rostami");

        Formatter formatter = new Formatter();
        formatter.format(Locale.JAPAN,"%s",person);
        System.out.println(formatter);
    }
}
