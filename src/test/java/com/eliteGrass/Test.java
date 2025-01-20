package com.eliteGrass;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-07-18  21:33
 * @Description
 */
public class Test {
	public static void main(String[] args) {
		//xmlBeanFactoryMethod(args);
		defaultBeanFactory(args);
	}


	/**
	 * 根据BeanFactory进行相关bean的创建
	 *
	 * @param args
	 */
	public static void xmlBeanFactoryMethod(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		System.out.println(factory.getBean("role"));
	}

	/**
	 * DefaultListableBeanFactory相关配置
	 *
	 * @param args
	 */
	public static void defaultBeanFactory(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
		System.out.println(beanFactory.getBean("role"));
	}
}
