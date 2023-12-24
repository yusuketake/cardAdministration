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
	
//	いらない。なぜなら、UserServiceImplで下の処理をやってるから。
//	@Autowired
//	private UserMapper userMapper;

	@GetMapping("/selectAll")
	public String getSelectAll(Model model) {

		// アカウント一覧取得
		List<MUser> userList = userService.selectAll();

		System.out.println(userList);
		String str = userList.toString();
		return str;

	}
}
