package com.designpattern.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatUtil {
	public static final String YYYYMMDD = "yyyy-MM-dd";
	public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	
	public static String dateToString(String format,Date date){
		String str = "--";
		if(date != null){
			SimpleDateFormat formats = new SimpleDateFormat(format,Locale.CHINESE);
			str = formats.format(date);
			formats = null;
		}
		return str;
	}
	
	public static Date stringToDate(String format,String str){
		SimpleDateFormat formats = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = formats.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		formats = null;
		return date;
	}
}
