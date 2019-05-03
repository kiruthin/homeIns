package com.homeIns.controller.authed;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.homeIns.model.account.objects.Customer;
import com.homeIns.model.objects.PolicyHolder;

@Controller
public class HomeServlet{

    @Autowired
    //Autowiring the ConversionService we declared in the context file above.
    private ConversionService conversionService;

	/*
	 * @InitBinder public void registerConversionServices(WebDataBinder dataBinder)
	 * { dataBinder.setConversionService(conversionService); }
	 */

	@RequestMapping("/")
	public ModelAndView startPage() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Start page</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("index", "message", message);
	}

	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}


    @RequestMapping(value="/GetQuote",
    			method=RequestMethod.POST,
    			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String getQuote(@ModelAttribute("ph") PolicyHolder ph, BindingResult result, Model model) {
  /*
	//public void getQuote(HttpServletRequest request, HttpServletResponse response){
     	Map<String, String[]> formParms = request.getParameterMap();
    	
     	PolicyHolder ph = new PolicyHolder();
    	formParms.forEach((k,v) -> {
    		System.out.println("Key: "+k+" Value: "+v);
    		});
  */
    	System.out.println("PH     = "+ ph);
    	System.out.println("Model  = "+ model);
    	System.out.println("Result = "+ result);

    	System.out.println("GetQuote is done");
   
    	return "login";
		//return new ModelAndView("save", "message", message);
	}
     
}
