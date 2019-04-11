package com.prg.calendar;

public class CalenderMain {
// calling constructor to get an object
// class variable_name = new(keyword) class brackets to construct
	SystemDate systemDateObject = new SystemDate();
// 	return_type method_name( arguments ) {body}
	
	void printTodayEvents() {
	//
		System.out.println("Calender Main: printTodayEvents START");
		systemDateObject.getPresentDate();
		
		Events eventsObject = new Events();
		eventsObject.getEventPresetDay();
		
		System.out.println("Calender Main: printTodayEvents END");
	}
	
	
}
