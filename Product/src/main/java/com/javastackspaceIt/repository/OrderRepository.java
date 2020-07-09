package com.javastackspaceIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastackspaceIt.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
