package com.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.di.controller.ConstructorInjectedController;
import com.di.controller.PropertyInjectedController;
import com.di.controller.SetterInjectedController;
import com.scan.MyController;

@SpringBootApplication
@ComponentScan(basePackages={"com.scan","com.scan.service","com.di"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DiDemoApplication.class, args);
		MyController myController=(MyController) ctx.getBean("myController");
		myController.sayHello();
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
	}
}
