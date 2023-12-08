package com.nt.service;

import java.util.List;

import com.nt.entity.Shop;

public interface IShopService {

	public Integer registerShop(Shop shop);
	public List<Shop> fetchShoppingList();
}
