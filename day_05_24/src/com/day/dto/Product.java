package com.day.dto;

import java.util.Date;

/*
 * 
  객체모델링(자바)
  객체의 속성 - 상품번호	: prod_no -> String
   				상품명		: prod_name -> String
   				가격		: price -> int
   				//수량		: ?
   				제조일자: prod_mf_dt : String/ Date
   				
  DB모델링(sql)
  엔터티의 속성 - 상품번호	: prod_no -> String
   				  상품명	: prod_name -> String
   			 	  가격		: price -> int
   				  //수량	: ? ※다른 테이블에 설정! 
  ☆속성 이름이 같아야. 작업이 편하므로 언더스코어 사용!


 */
public class Product {
	
	private String prod_no;
	private String prod_name;
	private int prod_price;
	private Date prod_mf_dt;
	private String prod_detail;
	
	public Product() {
		super();
	}

	// overloading
	public Product(String prod_no, String prod_name, int prod_price) {
		// 이렇게 호출 할 수 있는 줄은 몰랏네 
		this(prod_no, prod_name, prod_price, null, null);
	}
	
	public Product(String prod_no, String prod_name, int prod_price, Date prod_mf_dt, String prod_detail) {
		super();
		this.prod_no = prod_no;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_mf_dt = prod_mf_dt;
		this.prod_detail = prod_detail;
	}


	public String getProd_no() {
		return prod_no;
	}


	public void setProd_no(String prod_no) {
		this.prod_no = prod_no;
	}


	public String getProd_name() {
		return prod_name;
	}


	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}


	public int getProd_price() {
		return prod_price;
	}


	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}


	public Date getProd_mf_dt() {
		return prod_mf_dt;
	}


	public void setProd_mf_dt(Date prod_mf_dt) {
		this.prod_mf_dt = prod_mf_dt;
	}


	public String getProd_detail() {
		return prod_detail;
	}


	public void setProd_detail(String prod_detail) {
		this.prod_detail = prod_detail;
	}


	@Override
	public String toString() {
		return "Product [prod_no=" + prod_no + ", prod_name=" + prod_name + ", prod_price=" + prod_price
				+ ", prod_mf_dt=" + prod_mf_dt + ", prod_detail=" + prod_detail + "]";
	}
	
}
