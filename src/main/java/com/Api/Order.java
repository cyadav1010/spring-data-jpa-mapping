package com.Api;

import com.Dao.CustomerDao;
import com.Dao.ProductDao;
import com.Dto.OrderResponse;
import com.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Order {
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private ProductDao productDao;

    @PostMapping("/placeorder")
    public Customer placeOrder(@RequestBody Customer orderRequest){
        System.out.println("order request "+orderRequest);
        return customerDao.save(orderRequest);
    }

    @GetMapping("/Allorders")
    public List<Customer>getAllOrders(){
        return customerDao.findAll();
    }

    @GetMapping("/getinfo")
    public List<OrderResponse> getJoinInformation(){
        return customerDao.getJoinInformation();
    }
}
