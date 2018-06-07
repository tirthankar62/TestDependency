package com.tirtha.springdi;

import com.tirtha.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)

	{
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("mycontroller");
		controller.hello();
	}
}
