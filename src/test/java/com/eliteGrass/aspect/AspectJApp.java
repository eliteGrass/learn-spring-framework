package com.eliteGrass.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author liteGrass
 * @Date 2025-04-02  23:50
 * @Description
 */
@ComponentScan(basePackages = "com.eliteGrass.aspect")
@EnableAspectJAutoProxy
public class AspectJApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AspectJApp.class);

		applicationContext.getBean(TestClass.class).drink();
	}
}
