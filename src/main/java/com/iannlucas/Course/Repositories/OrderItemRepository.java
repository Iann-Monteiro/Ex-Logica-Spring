package com.iannlucas.Course.Repositories;

import com.iannlucas.Course.Classes.Category;
import com.iannlucas.Course.Classes.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
