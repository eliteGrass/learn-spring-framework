package com.eliteGrass.beanfactoryregistry;

import com.eliteGrass.beanfactoryregistry.imports.AImportSelector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

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
