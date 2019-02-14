package com.demo.controller;

import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 用户控制层
 * @Author: mason_ge
 * @Date: 15:12 2019/2/14
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@GetMapping("/all")
	public Object findAllUser(
			@RequestParam(name = "pageNum", required = false, defaultValue = "1")
					int pageNum,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10")
					int pageSize) {
		return userService.findAllUser(pageNum, pageSize);
	}

}
