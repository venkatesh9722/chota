package com.example.springbootk8scrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="order_tab")
public class Oreders {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int qty;
	private double price;
}
