package com.javastackspaceIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javastackspaceIt.bean.Payment;
import com.javastackspaceIt.bean.TransactionRequest;
import com.javastackspaceIt.bean.TransactionResponse;
import com.javastackspaceIt.entity.Order;
import com.javastackspaceIt.repository.OrderRepository;
import com.sun.el.stream.Optional;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Autowired
	private RestTemplate restTemplate;

	public TransactionResponse saveOrder(TransactionRequest request) {
		System.out.println("request : "+request.toString());
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setAmount(order.getPrice());
		payment.setOrderId(order.getId());

		repository.save(order);
		/// call to the payment service

		Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment,
				Payment.class);

		

		return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId());
	}
}
