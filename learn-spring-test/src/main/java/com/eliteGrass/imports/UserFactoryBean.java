package com.eliteGrass.imports;

import com.eliteGrass.entity.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-12-12  23:31
 * @Description
 */
public class UserFactoryBean implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		/*return (User) Proxy.newProxyInstance(User.class.getClassLoader(), new Class[]{User.class}, (proxy, method, args) -> {
			System.out.println("代理类生成");


			// method.invoke(User.class, args); 没有方法调用
			return null;
		});*/

		Enhancer enhancer = new Enhancer();
		enhancer.setClassLoader(User.class.getClassLoader());
		enhancer.setSuperclass(User.class);
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("代理类生成");
				return methodProxy.invokeSuper(o, objects);
			}
		});
		return (User) enhancer.create();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
