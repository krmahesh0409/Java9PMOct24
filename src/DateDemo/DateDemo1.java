package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        // dd/MM/yyyy
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = sd.format(date);
        System.out.println("dateStr="+dateStr);


          //→ dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        String dateStr0 = sd0.format(date);
        System.out.println("dateStr0="+dateStr0);


            //→ dd | MMMM yy hh:mm


            //→ yyyy-MM-dd | hh:mm:ss


            //→ EEEE yyyy/MM/dd


            //→ dd-MM-yyyy | E | hh:mm


            //→ hh:mm:ss

    }
}
