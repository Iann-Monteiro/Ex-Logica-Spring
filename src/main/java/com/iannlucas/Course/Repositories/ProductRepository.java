package com.iannlucas.Course.Repositories;

import com.iannlucas.Course.Classes.Order;
import com.iannlucas.Course.Classes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
