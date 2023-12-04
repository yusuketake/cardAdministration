package com.benkyo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.benkyo.domain.user.model.MUser;
import com.benkyo.service.UserService;

@Controller
@RequestMapping("/accounts")
public class SearchAccountController {

	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/selectAll")
	public void getSelectAll(Model model) {

		MUser user = null;

		// アカウント一覧取得
		List<MUser> userList = userService.selectAll(user);

		System.out.println(userList);

	}
}
