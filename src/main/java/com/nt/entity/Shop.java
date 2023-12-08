package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Shop {

	@Id
	@GeneratedValue
	private int id;
	private Long shopNo;
	private String shop_Name;
	private String address;
	
}
