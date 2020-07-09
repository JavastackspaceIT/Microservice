package com.javastackspaceIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javastackspaceIt.bean.Payment;
import com.javastackspaceIt.bean.TransactionRequest;
import com.javastackspaceIt.bean.TransactionResponse;
import com.javastackspaceIt.entity.Order;
import com.javastackspaceIt.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping(value= "/doOrder")
	public TransactionResponse  doOrder(@RequestBody TransactionRequest request) {
		
		return  orderService.saveOrder(request);
	}
	
	@GetMapping("/message")
	public String message() {
		return "message ";
	}

}
