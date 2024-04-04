package com.iannlucas.Course.Repositories;

import com.iannlucas.Course.Classes.Category;
import com.iannlucas.Course.Classes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
