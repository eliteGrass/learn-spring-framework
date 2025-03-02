package com.eliteGrass.beanfactoryregistry;

import com.eliteGrass.beanfactoryregistry.imports.AImport;
import com.eliteGrass.beanfactoryregistry.imports.AImportSelector;
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
@Import(AImportSelector.class)
public class BeanFactoryRegistryApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(BeanFactoryRegistryApp.class);
		// applicationContext.addBeanFactoryPostProcessor(new MyBeanDefinitionRegisterPostProcessor());
		applicationContext.refresh();
	}
}
