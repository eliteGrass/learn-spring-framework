package com.eliteGrass.aspect;

import org.springframework.stereotype.Component;

/**
 * @Author liteGrass
 * @Date 2025-04-02  23:49
 * @Description
 */
@Component
public class TestClass {

	public String eat() {
		System.out.println("TestClass.eat");
		return "TestClass.eat";
	}

	public String drink() {
		System.out.println("TestClass.drink");
		return "TestClass.drink";
	}

}
