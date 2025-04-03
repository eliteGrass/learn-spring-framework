package com.eliteGrass.beanfactoryregistry;

import com.eliteGrass.beanfactoryregistry.imports.AImport;
import com.eliteGrass.beanfactoryregistry.imports.AImportSelector;
import org.springframework.aop.config.AopConfigUtils;
import org.springframework.aop.framework.AopContext;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author liteGrass
 * @Date 2025-02-23  22:18
 * @Description
 */
@ComponentScan("com.eliteGrass.beanfactoryregistry.scan")
// @Component
@PropertySource("classpath:jdbc.properties")
@Import(AImportSelector.class)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class BeanFactoryRegistryApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(BeanFactoryRegistryApp.class);
		// applicationContext.addBeanFactoryPostProcessor(new MyBeanDefinitionRegisterPostProcessor());
		applicationContext.refresh();


	}
}
