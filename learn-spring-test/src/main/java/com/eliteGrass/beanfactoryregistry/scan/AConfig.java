package com.eliteGrass.beanfactoryregistry.scan;

import com.eliteGrass.beanfactoryregistry.entity.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liteGrass
 * @Date 2025-02-26  21:50
 * @Description
 */
@Configuration
public class AConfig {

	@Bean
	public B b() {
		return new B();
	}

}
