package com.demo.service;

import com.demo.pojo.Bdf2User;
import com.github.pagehelper.PageInfo;

/**
 * @Description:
 * @Author: mason_ge
 * @Date: 15:06 2019/2/14
 */
public interface UserService {
	/**
	 * 插入数据
	 *
	 * @param record
	 * @return
	 */
	int insert(Bdf2User record);

	/**
	 * 查询所有用户
	 *
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PageInfo<Bdf2User> findAllUser(int pageNum, int pageSize);
}
