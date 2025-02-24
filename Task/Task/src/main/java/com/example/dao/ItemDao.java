package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Items;

@Repository
public interface ItemDao extends JpaRepository<Items, Long>{

}
