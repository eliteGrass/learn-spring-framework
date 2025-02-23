package com.eliteGrass.beanfactoryregistry;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author liteGrass
 * @Date 2025-02-23  22:18
 * @Description
 */
@ComponentScan("com.eliteGrass.beanfactoryregistry")
public class BeanFactoryRegistryApp implements BeanDefinitionRegistryPostProcessor {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(BeanFactoryRegistryApp.class);
		applicationContext.addBeanFactoryPostProcessor(new MyBeanDefinitionRegisterPostProcessor());
		applicationContext.refresh();
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
