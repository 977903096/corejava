import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
/*
 * 该类中是对时间类。日历类的练习
 * */
public class Test {

	public static void main(String[] args) {
		//获取当前系统的时间
		long l = System.currentTimeMillis();
		System.out.println(l);
		//date类的练习
		Date date = new Date(10000000000L);
		System.out.println(date);
		//dateformat的练习
			DateFormat df = DateFormat.getDateInstance() ;
			df.format(date);
			System.out.println(date);
			//类 Calendar
			Calendar ca =  Calendar.getInstance();
			ca.set(1990,10,10,21,10,9);
			System.out.println(ca.getTime());
			SimpleDateFormat sm = new SimpleDateFormat("yyyy.mm.dd HH.MM.ss");
			System.out.println(sm.toPattern());
			System.out.println(sm.format(ca.getTime()));
			
			GregorianCalendar gc = new GregorianCalendar();
			System.out.println(gc.getTime());
			System.out.println(sm.format(gc.getTime()));
			gc.set(1990, 1, 3, 4, 6);
			System.out.println(sm.format(gc.getTime()));
			gc.add(Calendar.HOUR, 7);
			System.out.println(sm.format(gc.getTime()));
	}
}
