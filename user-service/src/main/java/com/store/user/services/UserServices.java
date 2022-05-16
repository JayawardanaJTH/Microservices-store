package com.store.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.user.entity.User;
import com.store.user.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {

		return userRepository.save(user);
	}

	public User getUserById(Long userId) {
		
		return userRepository.findByUserId(userId);
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public boolean deleteUserById(Long userId) {
		
		try {
			userRepository.deleteById(userId);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public User updateUser(User user) {
		
		User tempUser = userRepository.findByUserId(user.getUserId());
		
		tempUser.setUserName(user.getUserName());
		tempUser.setUserEmail(user.getUserEmail());
		tempUser.setContact(user.getContact());
		
		return userRepository.save(tempUser);
	}

}
