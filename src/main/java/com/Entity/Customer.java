package com.Entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private  String email;
    private  String gender;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "id")
    private List<Product>products;
}
