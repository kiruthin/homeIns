package com.homeIns.controller.authed;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.homeIns.controller.authed.service.ResidenceService;
import com.homeIns.model.objects.Residence;

@Component
public class ResidenceFormatter implements Formatter<Residence> {
	//@Autowired
	//private ResidenceService residenceService;

	@Override
	public String print(Residence res, Locale arg1) {
		return res.toString();
	}

	@Override
	public Residence parse(String test, Locale arg1) throws ParseException {
		System.out.println("Parse called in formatter");
		return new Residence(test, test, test, test, test, test, 0);
		//return actorService.getActor(actorId);
	    //Else you can just return a new object by setting some values
	    //which you deem fit.
	}
}