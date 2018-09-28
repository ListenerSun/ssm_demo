package com.sqt.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqt.mapper.UserMapper;
import com.sqt.pojo.User;
import com.sqt.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired	
	private UserMapper userMapper;
	
	
	@Override
	public User findUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.findUser(user);
	}


	@Override
	public List<User> findList() {
		// TODO Auto-generated method stub
		return userMapper.findList();
	}

}
