package com.iannlucas.Course.Repositories;

import com.iannlucas.Course.Classes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
