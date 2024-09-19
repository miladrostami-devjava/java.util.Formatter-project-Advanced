package ir.formatter.formattableflags;

import java.util.Formattable;
import java.util.FormattableFlags;
import java.util.Formatter;

public class CustomDate implements Formattable {
    private int year;
    private int month;
    private int day;

    public CustomDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        StringBuilder stringBuilder = new StringBuilder();

        if ((flags & FormattableFlags.ALTERNATE ) != 0){
stringBuilder.append(String.format("%02d%02d%04d",month,day,year));

        }else {
            stringBuilder.append(String.format("%04d%02d%02d",year,month,day));
        }
        formatter.format(stringBuilder.toString());
    }
}
