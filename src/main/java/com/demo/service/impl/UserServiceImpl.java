package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.pojo.Bdf2User;
import com.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: mason_ge
 * @Date: 15:08 2019/2/14
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public int insert(Bdf2User record) {
		return userDao.insert(record);
	}

	@Override
	public PageInfo<Bdf2User> findAllUser(int pageNum, int pageSize) {
		//将参数传给这个方法就可以实现物理分页了，非常简单。
		PageHelper.startPage(pageNum, pageSize);
		List<Bdf2User> userLists = userDao.selectUsers();
		PageInfo result = new PageInfo(userLists);
		return result;
	}
}
