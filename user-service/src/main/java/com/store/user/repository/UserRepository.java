package com.store.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(Long userId);

}
