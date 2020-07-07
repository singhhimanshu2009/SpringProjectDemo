package com.aop.aspects;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AccountAspect {
	
	@Pointcut("execution (* com.aop.account.Account.*(..))")
	public void Log() {}
	
	@Before("Log()")
	public void preprocessing(JoinPoint jp) {
		Object [] ar = jp.getArgs();
		List<Object> List = Arrays.asList(ar);
		String str = jp.getSignature().getName();
		System.out.println("Before avice is applied on "+str +" and with argument(s)"+ List);
	}
	
//	@After("execution (* com.aop.account.Account.deposit(..))")
	@After("Log()")
	public void postprocessing(JoinPoint jp) {
		Object [] ar1 = jp.getArgs();
		List<Object> List1 = Arrays.asList(ar1);
		String str1 = jp.getSignature().getName();
		System.out.println("After advice is applied on "+str1+ " With arguments: "+List1);
		
	}
}
