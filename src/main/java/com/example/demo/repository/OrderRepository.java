package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.demo.entity.Orders;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <Orders, Integer>{



}
