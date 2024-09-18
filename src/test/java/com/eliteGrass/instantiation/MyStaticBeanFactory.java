package com.eliteGrass.instantiation;

import com.eliteGrass.entity.User;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-07-29  23:56
 * @Description 静态工厂进行实例化
 */
public class MyStaticBeanFactory {

	public static User createUser() {
		return new User();
	}

}
