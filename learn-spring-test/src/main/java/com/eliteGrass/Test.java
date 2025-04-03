package com.eliteGrass;

import com.eliteGrass.factorybeanpostprocessor.UserBeanDefinitionRegistryPostProcessor;
import com.eliteGrass.factorybeanpostprocessor.UserBeanFactoryPostProcessor;
import com.eliteGrass.propertyeditor.User;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.ClassPathResource;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-07-18  21:33
 * @Description
 */
// @Import(MyImportRegister.class)
@ImportResource("applicationContext1.xml")
@Import({UserBeanFactoryPostProcessor.class, UserBeanDefinitionRegistryPostProcessor.class})
public class Test {
	public static void main(String[] args) {
		// xmlBeanFactoryMethod(args);
		// defaultBeanFactory(args);
		annotationApplication(args);
	}


	/**
	 * 根据BeanFactory进行相关bean的创建
	 *
	 * @param args
	 */
	@SuppressWarnings("deprecation")
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

	public static void annotationApplication(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Test.class);
		User user1 = (User) applicationContext.getBean("user");
		System.out.println(user1);
		User user2 = (User) applicationContext.getBean("user");
		System.out.println(user2);
		// System.out.println(user.getUserName());
	}
}
