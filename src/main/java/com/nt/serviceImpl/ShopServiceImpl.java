package com.nt.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Shop;
import com.nt.repo.IShopRepo;
import com.nt.service.IShopService;

@Service
public class ShopServiceImpl implements IShopService{

	@Autowired
	private IShopRepo repo;

	@Override
	public Integer registerShop(Shop shop) {
		return repo.save(shop).getId();
	}
	
	@Override
	public List<Shop> fetchShoppingList() {
		return repo.findAll();
	}
}
