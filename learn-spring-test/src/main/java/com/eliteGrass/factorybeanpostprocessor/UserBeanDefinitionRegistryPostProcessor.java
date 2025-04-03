package com.eliteGrass.factorybeanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @Author liteGrass
 * @Date 2025-02-19  22:34
 * @Description
 */
public class UserBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行UserBeanDefinitionRegistryPostProcessor --- postProcessBeanDefinitionRegistry");
		BeanDefinition user = registry.getBeanDefinition("user");
		user.setScope(BeanDefinition.SCOPE_PROTOTYPE);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行UserBeanDefinitionRegistryPostProcessor --- postProcessBeanFactory");
	}
}
