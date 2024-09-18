package com.eliteGrass.instantiation;

import com.eliteGrass.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-07-30  00:14
 * @Description 实现相关接口
 */
public class MyImplBeanFactory implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
