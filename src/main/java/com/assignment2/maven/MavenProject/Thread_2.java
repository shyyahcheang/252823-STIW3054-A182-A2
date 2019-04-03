package com.assignment2.maven.MavenProject;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Thread_2 implements Runnable {
	
	public void run() {
		Calendar examStart = new GregorianCalendar();
	    Calendar examEnd = new GregorianCalendar();
	    Calendar holidayStart = new GregorianCalendar();
	    Calendar holidayEnd = new GregorianCalendar();
	    
	    examStart.set(2019, 05, 25);
	    examEnd.set(2019, 06, 20);
	    holidayStart.set(2019, 06, 03);
	    holidayEnd.set(2019, 06, 11);
	    
	    int exam = daysBetween(examStart.getTime(), examEnd.getTime());
	    int holiday = daysBetween(holidayStart.getTime(), holidayEnd.getTime());
	    int days = (exam - holiday) + 1;
	    
	    System.out.println("\nTotal number of days are " + days);
	}

	public static int daysBetween(Date d1, Date d2) {
		return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}
}
