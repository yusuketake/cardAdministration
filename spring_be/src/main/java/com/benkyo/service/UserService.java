package com.benkyo.service;

import java.util.List;

import com.benkyo.domain.user.model.MUser;

public interface UserService {
	public List<MUser> selectAll();
}
