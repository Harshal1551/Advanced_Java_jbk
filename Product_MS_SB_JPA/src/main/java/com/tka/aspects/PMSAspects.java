package com.tka.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PMSAspects {

	@Before("execution(* com.tka.service.*.*(..))")
	public void loginCheck() {
		System.out.println("Checking login status of user");
	}
	
	
	
}
