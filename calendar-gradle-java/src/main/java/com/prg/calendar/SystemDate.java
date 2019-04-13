package com.prg.calendar;

import java.util.Date;

public class SystemDate {
	//public Date getPresentDate;

	public Date getPresentDate() {
	//we change it from void to Date 	 
		 
		System.out.println("SystemDate :getPresentDate START");
		
		Date presentDay= new Date();
		System.out.println(presentDay);
		
		System.out.println("SystemDate :getPresentDate END");
		return presentDay;
	}

}
