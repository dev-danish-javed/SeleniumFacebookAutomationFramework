package facebook.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utility.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Rough {
    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
        Date date = new Date();
        System.out.println(date);
        System.out.println(formatter.format(date));
    }
}
