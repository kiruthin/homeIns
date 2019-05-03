package com.homeIns.controller.authed;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.servlet.ModelAndView;

@Aspect
public class AuthCheckAdvice {

    @Pointcut("execution(* com.homeIns.controller.authed.*.*(..))")
    public void methods(){}
    
    @Around("methods()")
    Object checkSecurity(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Additional Concern Before calling actual method");

		System.out.println("Signature     =" + pjp.getSignature());
		System.out.println("Kind          =" + pjp.getKind());
		System.out.println("prp           =" + pjp);
		System.out.println("prp.targobj   =" + pjp.getTarget());
		System.out.println("Args          =" + pjp.getArgs());

		System.out.println("SourceLocation=" + pjp.getSourceLocation());
		System.out.println("This object   =" + pjp.getThis());
		
		boolean authenticated = true;
		if(authenticated)
		{
			Object obj = pjp.proceed();
			return obj;
		}
		else 
		{
//			return new ModelAndView();
			System.out.println("Not autheticated");
			return new ModelAndView("login", "message", "Not authenticated");

		}
		
	}


}
