package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Shop;
import com.nt.service.IShopService;

@RestController
public class ShopController {

	@Autowired
	private IShopService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveShop(@RequestBody Shop shop){
		Integer id=service.registerShop(shop);
		return new ResponseEntity<String>(id+ " Registered",HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Shop>> showAllShops(){
		List<Shop> list=service.fetchShoppingList();
		return new ResponseEntity<List<Shop>>(list,HttpStatus.OK);
	}
}
