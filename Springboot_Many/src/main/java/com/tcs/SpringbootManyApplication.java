package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tcs.service.UserService;

@SpringBootApplication
public class SpringbootManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext bean = SpringApplication.run(SpringbootManyApplication.class, args);
		
		UserService bean2 = bean.getBean(UserService.class);
		
		bean2.saveData();
	}

}
