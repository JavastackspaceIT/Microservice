package com.javastackspaceIt.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javastackspaceIt.entitiy.Payment;
import com.javastackspaceIt.repository.PaymentRespository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRespository respository;

	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return respository.save(payment);
	}
	
	
	public Payment findPaymentHistoryById(int orderId) {
		
	return 	respository.findByOrderId(orderId);
	}
	
	
	
	public String paymentProcessing() {
		
		return new Random().nextBoolean()? "success" : "failure";
	}
}

