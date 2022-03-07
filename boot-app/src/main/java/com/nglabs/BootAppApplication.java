package com.nglabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootAppApplication.class, args);
		Alien obj = ctx.getBean(Alien.class);
		obj.code();
	}

}
