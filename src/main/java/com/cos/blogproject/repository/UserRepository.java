package com.cos.blogproject.repository;

import com.cos.blogproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
}
