package com.example.springh2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springh2.dao.UserRepository;
import com.example.springh2.entity.User;
import com.sun.el.stream.Optional;
import com.sun.el.stream.Optional;

@Service
public class UserService {
@Autowired
private	UserRepository userRepository;

public User createUser(User user) {
	return userRepository.save(user);
}

public List<User> createUsers(List<User> users) {
	return userRepository.saveAll(users);
}

public User getUserById(int id) {
	return userRepository.findById(id).orElse(null);
}

public List<User> getUsers() {
	return userRepository.findAll();
}

public User updateUser(User user) {
	User oldUser=null;
	java.util.Optional<User> optionaluser=userRepository.findById(user.getId());
	if(optionaluser.isPresent()) {
		oldUser=optionaluser.get();
		oldUser.setName(user.getName());
		oldUser.setCaptain(user.getCaptain());
		oldUser.setOwner(user.getOwner());
		userRepository.save(oldUser);
	}else {
		return new User();
	}
	return oldUser;
}

public String deleteUserById(int id) {
	userRepository.deleteById(id);
	return "User deleted";
}
}
