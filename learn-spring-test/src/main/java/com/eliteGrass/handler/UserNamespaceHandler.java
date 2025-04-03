package com.eliteGrass.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-07-29  06:18
 * @Description user类处理器
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("custom-user-bern", new UserBeanDefinitionParse());
	}
}
