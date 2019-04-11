package calendar;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prg.calendar.SystemDate;

@Controller
public class CalendarController {
	
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }      

    @GetMapping("/date")//calender
    public String date(Model model) {
    	
    	SystemDate systemDate= new SystemDate();
    	Date todaysDate=systemDate.getPresentDate;
    	//Date type declarsation inline and assignment.
        model.addAttribute("todaysDate", todaysDate);
        
        //change the attribute to todays 
        
        return "date";//calendar
    }
}