package com.apress.springrecipes.court.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
// Bind controller to URL /welcome
// initial view will be resolved to the name returned in the default GET method
@RequestMapping("/welcome")
public class WelcomeController {

    // Controller will always look for a default GET method to call first, irrespective of name
    // In this case, named welcome to ease identification
    @RequestMapping(method = RequestMethod.GET)
    // Method contains Model input to setup date object
    // NOTE: Model is a Java 5 interface -- newer than the older ModelMap and still older ModelAndView
    public String welcome(Model model) {
        Date today = new Date();
	// Add date to model so it can be display in view
	model.addAttribute("today",today);
	// Return view welcome. Via resolver the view
	// will be mapped to /WEB-INF/jsp/welcome.jsp
        return "welcome";
    }
    @RequestMapping(method = RequestMethod.POST)
    // Submission will come with courtName field, also add Model to return results 
    public String submitForm() {
	
        return "redirect:/reservationQuery";
    }
}