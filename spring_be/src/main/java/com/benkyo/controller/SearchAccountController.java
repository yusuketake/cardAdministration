package com.benkyo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benkyo.domain.user.model.MUser;
import com.benkyo.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
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
		ObjectMapper objectmapper = new ObjectMapper();
		String json;
		try {
			json = objectmapper.writeValueAsString(userList);
			System.out.println(json);
			return json;

		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			new	Exception("データなし");
			return "データなし";
		}			
	}
}
