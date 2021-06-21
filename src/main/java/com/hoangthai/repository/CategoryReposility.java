package com.hoangthai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoangthai.entity.CategoryEntity;

public interface CategoryReposility extends JpaRepository<CategoryEntity, String>{
	CategoryEntity findOneByCode(String code);
}
