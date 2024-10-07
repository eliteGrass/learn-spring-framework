package com.eliteGrass;

import com.eliteGrass.entity.User;
import com.eliteGrass.instantiation.MyImplBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Arrays;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-07-18  21:33
 * @Description
 */
public class Test {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		System.out.println(factory.getBean("user3"));
		System.out.println(factory.getBean("&user3"));
		System.out.println(factory.getBean("user3"));
		Arrays.stream(factory.getSingletonNames()).forEach(System.out::println);
//		System.out.println(applicationContext.getBean("role"));
	}
}
