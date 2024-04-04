package com.iannlucas.Course.Repositories;

import com.iannlucas.Course.Classes.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
