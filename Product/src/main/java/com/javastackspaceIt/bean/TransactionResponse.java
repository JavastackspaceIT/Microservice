package com.javastackspaceIt.bean;

import com.javastackspaceIt.entity.Order;

public class TransactionResponse {

	private Order order;
	private double amount;
	private String transactionId;

	public TransactionResponse() {
		// TODO Auto-generated constructor stub
	}
	public TransactionResponse(Order order, double amount, String transactionId) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "TransactionResponse [order=" + order + ", amount=" + amount + ", transactionId=" + transactionId + "]";
	}

}
