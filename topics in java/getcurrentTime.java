package cool;

import java.text.SimpleDateFormat;
import java.util.*;

public class getcurrentTime {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.print(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.print(timeFormat.format(currentDate));

        SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEE");
        System.out.println(dayOfTheWeek.format(currentDate));
    }
}
