package com.eliteGrass.entity;

/**
 * @Company Huahui Information Technology Co., LTD.
 * @Author elitegrass
 * @Date 2024-08-11  08:12
 * @Description 角色类
 */
public class Role {
	private int id;
	private Product product;

	public Role() {
	}

	public Role(int id, Product product) {
		this.id = id;
		this.product = product;
	}
}
