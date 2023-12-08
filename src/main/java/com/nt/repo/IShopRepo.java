package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Shop;

public interface IShopRepo extends JpaRepository<Shop, Integer> {

}
