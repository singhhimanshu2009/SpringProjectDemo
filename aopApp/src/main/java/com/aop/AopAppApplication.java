package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aop.account.Account;
import com.aop.account.Accountimpl;

@SpringBootApplication
public class AopAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AopAppApplication.class, args);
		Account account = (Account)ctx.getBean(Account.class);
		account.deposit(1000, 2000);
		//account.withdrawal();
	}

}