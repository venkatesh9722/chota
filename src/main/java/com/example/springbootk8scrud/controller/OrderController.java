package com.example.springbootk8scrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootk8scrud.Service.OrderService;
import com.example.springbootk8scrud.entity.Oreders;

@RestController
@RequestMapping("/orders")
public class OrderController {

	
	@Autowired
	private OrderService service;
	@PostMapping
	public Oreders addOrders(@RequestBody Oreders orders) {
		return service.saveOrders(orders);
	}
	@GetMapping
	public List<Oreders> getOrders()
	{
		return service.getOrders();		
	}
	
}
