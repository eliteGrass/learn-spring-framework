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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
