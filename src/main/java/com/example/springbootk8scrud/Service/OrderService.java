package com.example.springbootk8scrud.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootk8scrud.entity.Oreders;
import com.example.springbootk8scrud.repo.OrderRepo;


@Service
public class OrderService {

	@Autowired
	private OrderRepo orderRepo;
	
	
	public Oreders saveOrders(Oreders order)
	{
		return orderRepo.save(order);
	}
	
	public List<Oreders> getOrders(){
		return orderRepo.findAll();		
	}
}
