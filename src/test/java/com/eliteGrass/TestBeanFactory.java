package com.eliteGrass;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: eliteGrass
 * @CreateTime: 2024-02-25  20:37
 * @Description:
 */
public class TestBeanFactory {
	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Object user = xmlBeanFactory.getBean("user");
		System.out.println(user);
	}

	@Test
	public void tmEnvironment(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		environment.getPropertySources();

	}

}
