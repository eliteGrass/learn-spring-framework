package com.eliteGrass.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-07-18  21:32
 * @Description
 */
public class User implements BeanFactoryAware, InitializingBean, DisposableBean {
	private String userName;
	private String password;
	private Integer age;
	private Product product;
	private BeanFactory beanFactory;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("set方式进行注入");
		this.password = password;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("通过Aware的方式进行注入");
		this.beanFactory = beanFactory;
	}

	public void initMethod() {
		System.out.println("init-method方式进行初始化");
	}

	public void destroyMethod() {
		System.out.println("destroy-method方式进行销毁");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("实现disposableBean方式进行销毁");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("实现initializingBean的方式进行初始化");
	}
}
