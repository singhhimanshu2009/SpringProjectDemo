package com.aop.account;

import org.springframework.stereotype.Component;

//@Service
@Component
public class Accountimpl implements Account{

	public void withdrawal() {
		
		System.out.println("Withdrawal");
		
	}

	
	public void deposit(Integer a, Integer b) {
		System.out.println("Amount: "+ a +" AccNO: "+b);
		
	}

}
