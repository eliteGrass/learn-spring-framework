package com.eliteGrass.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author liteGrass
 * @Date 2025-04-02  23:47
 * @Description
 */
@Aspect
@Component
public class MyAspectj {

	/*@Pointcut("execution(* com.eliteGrass.aspect..*(..))")
	private void pointcut(){}
*/

	@Before("execution(* com.eliteGrass.aspect..*(..))")
	private void before(JoinPoint joinPoint){
		System.out.println("MyAspectj.before");
	}
}
