package ir.formatter.formattable;

import java.util.Formattable;
import java.util.FormattableFlags;
import java.util.Formatter;

public class Person implements Formattable {
    private int age;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
StringBuilder builder = new StringBuilder();

if ((flags & FormattableFlags.UPPERCASE) != 0){
    builder.append(firstName.toUpperCase()).append(" ").append(lastName.toUpperCase());
}else {
    builder.append(firstName).append(lastName).append(" ");
}

builder.append(" ,Age: ").append(age);

formatter.format(builder.toString());


    }
}
