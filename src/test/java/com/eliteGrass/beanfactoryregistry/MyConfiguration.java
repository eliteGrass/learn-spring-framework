package com.eliteGrass.beanfactoryregistry;

import com.eliteGrass.beanfactoryregistry.entity.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liteGrass
 * @Date 2025-02-24  20:21
 * @Description
 */
public class MyConfiguration {
	@Bean
	public D d() {
		return new D();
	}
}
