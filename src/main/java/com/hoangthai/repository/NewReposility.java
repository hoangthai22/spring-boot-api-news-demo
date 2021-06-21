package com.hoangthai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoangthai.entity.NewEntity;

public interface NewReposility extends JpaRepository<NewEntity, Long>{

}
