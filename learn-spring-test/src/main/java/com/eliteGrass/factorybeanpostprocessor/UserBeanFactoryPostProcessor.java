package com.eliteGrass.factorybeanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author liteGrass
 * @Date 2025-02-19  22:13
 * @Description
 */
public class UserBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行相关UserBeanFactoryPostProcessor");
		BeanDefinition user = beanFactory.getBeanDefinition("user");
		user.setScope("singleton");
	}
}
