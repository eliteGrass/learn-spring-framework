package com.eliteGrass;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: eliteGrass
 * @CreateTime: 2024-02-25  20:37
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Object user = xmlBeanFactory.getBean("user");
		System.out.println(user);
	}
}
