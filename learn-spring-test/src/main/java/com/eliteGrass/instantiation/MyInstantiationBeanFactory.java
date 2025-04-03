package com.eliteGrass.instantiation;

import com.eliteGrass.entity.User;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-07-30  00:01
 * @Description 实例化工厂
 */
public class MyInstantiationBeanFactory {

	public User createUser() {
		return new User();
	}

}
