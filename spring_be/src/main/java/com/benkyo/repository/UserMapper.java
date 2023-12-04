package com.benkyo.repository;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.benkyo.domain.user.model.MUser;

@MapperScan
public interface UserMapper {
	public List<MUser> selectAll(MUser user);
}
