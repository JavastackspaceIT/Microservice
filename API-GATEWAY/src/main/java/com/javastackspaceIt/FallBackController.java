package com.javastackspaceIt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/paymentFallBack")
	public String paymentService() {
		
		return "payment service is currently slow or down please try again";
	}
	
	
	@GetMapping("/orderService")
	public String orderService() {
		return "Order service is currently slow or down please try again";
	}
}
