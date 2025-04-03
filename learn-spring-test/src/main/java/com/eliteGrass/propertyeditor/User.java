package com.eliteGrass.propertyeditor;

import com.eliteGrass.beanfactoryregistry.entity.D;
import org.springframework.context.annotation.Import;

import java.util.Date;

/**
 * @Author liteGrass
 * @Date 2025-02-19  21:59
 * @Description
 */
@Import(D.class)
public class User {
	private String name;
	private int age;
	private Date birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
