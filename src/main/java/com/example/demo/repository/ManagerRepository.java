package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Managers;
import org.springframework.stereotype.Repository;

@Repository
public interface  ManagerRepository extends JpaRepository <Managers, Integer>{




}
