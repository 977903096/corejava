import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
/*
 * �������Ƕ�ʱ���ࡣ���������ϰ
 * */
public class Test {

	public static void main(String[] args) {
		//��ȡ��ǰϵͳ��ʱ��
		long l = System.currentTimeMillis();
		System.out.println(l);
		//date�����ϰ
		Date date = new Date(10000000000L);
		System.out.println(date);
		//dateformat����ϰ
			DateFormat df = DateFormat.getDateInstance() ;
			df.format(date);
			System.out.println(date);
			//�� Calendar
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
