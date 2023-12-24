package com.benkyo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benkyo.domain.user.model.MUser;
import com.benkyo.repository.UserMapper;
import com.benkyo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;
	
	@Override
	public List<MUser> selectAll() {
		return mapper.selectAll();
	}
}
