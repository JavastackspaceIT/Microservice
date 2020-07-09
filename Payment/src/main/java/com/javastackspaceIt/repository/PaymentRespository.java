package com.javastackspaceIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastackspaceIt.entitiy.Payment;

public interface PaymentRespository extends JpaRepository<Payment, Integer>{

	Payment findByOrderId(int orderId);

}
