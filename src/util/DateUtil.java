package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static SimpleDateFormat format;
	
	public static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";
	
	public static String datetime(Date date) {
		format = new SimpleDateFormat(DATE_TIME);
		return format.format(date);
	}
}
