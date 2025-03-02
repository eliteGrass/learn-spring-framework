package com.eliteGrass.beanfactoryregistry.scan;

import com.eliteGrass.beanfactoryregistry.entity.A;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author liteGrass
 * @Date 2025-02-26  22:22
 * @Description
 */
@Component
public class AComponent {

	@Bean
	public A a(){
		return new A();
	}

}
