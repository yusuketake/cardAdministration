package com.benkyo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.benkyo.domain.user.model.MUser;

@Mapper
public interface UserMapper {

	public List<MUser> selectAll();
}
