package com.example.springbootk8scrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springbootk8scrud.entity.Oreders;

@Repository
public interface OrderRepo extends JpaRepository<Oreders, Integer>{

}
