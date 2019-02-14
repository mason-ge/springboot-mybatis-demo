package com.demo.dao;

import com.demo.pojo.Bdf2User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: mason_ge
 * @Date: 14:54 2019/2/14
 */
@Mapper
public interface UserDao {
	/**
	 * 插入数据
	 *
	 * @param record
	 * @return
	 */
	int insert(Bdf2User record);

	/**
	 * 查询用户
	 *
	 * @return
	 */
	List<Bdf2User> selectUsers();
}
