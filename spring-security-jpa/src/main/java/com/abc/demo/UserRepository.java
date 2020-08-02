package com.abc.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.demo.model.User;



public interface UserRepository extends JpaRepository<User,Integer> {
	Optional<User> findByUserName(String userName);

}
