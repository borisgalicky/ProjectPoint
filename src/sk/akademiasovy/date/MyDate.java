package sk.akademiasovy.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate{

    public void today(){
        Date date=new Date();
        System.out.println(date);
    }

    public void today2(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE dd"+"."+"MMMM yyyy HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}
