package com.eliteGrass.imports;

import com.eliteGrass.entity.User;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-12-12  23:31
 * @Description
 */
public class UserFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return (User) Proxy.newProxyInstance(User.class.getClassLoader(), new Class[]{User.class}, (proxy, method, args) -> {
			System.out.println("代理类生成");
			return null;
		});
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
