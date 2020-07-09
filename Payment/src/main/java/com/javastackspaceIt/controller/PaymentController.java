package com.javastackspaceIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javastackspaceIt.entitiy.Payment;
import com.javastackspaceIt.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@PostMapping(value = "/doPayment")
	public Payment doPayment(@RequestBody Payment payment) {

		return paymentService.doPayment(payment);
	}
	
	
	@GetMapping("findHistorybyId/{orderId}")
	public Payment findPaymentHistoryById(@PathVariable int orderId) {
		
		return paymentService.findPaymentHistoryById(orderId);
		
	}
	
	
	@GetMapping("/m1")
	public String m1() {
		return "m1 message";
	}
}
