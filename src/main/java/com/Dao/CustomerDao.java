package com.Dao;

import com.Dto.OrderResponse;
import com.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.Dto.OrderResponse (c.name ,p.ProdName) from Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
