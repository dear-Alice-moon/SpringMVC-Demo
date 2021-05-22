package com.moon.mvc.service;

import java.util.List;

import com.moon.mvc.pojo.User;

public interface UserService {
	
	/**
	 * 通过id查找 User
	 * 
	 * @param id
	 * @return
	 * 
	 * @author moon  2019/10/17  16:57
	 */
	User findUserById(Long id); 
	
	
	/**
	 * 通过'姓名'查找User
	 * 
	 * @param name
	 * @return
	 * 
	 * @author moon  2019/10/17  16:59
	 */
	User findUserByName(String name);
	
	
	/**
	 * 新增User
	 * 
	 * @param user
	 * 
	 * @author moon  2019/10/17  17:00
	 */
	void saveUser(User user);
	
	
	/**
	 * 更新User
	 * 
	 * @param user
	 * 
	 * @author moon  2019/10/17  17:01
	 */
	void updateUser(User user);
	
	
	/**
	 * 通过 Id 删除 User
	 * 
	 * @param id
	 * 
	 * @author moon  2019/10/17  17:02
	 */
	void deleteUserById(Long id);
	
	
	/**
	 * 查询所有的User信息
	 * 
	 * @return
	 * 
	 * @author moon  2019/10/17  17:03
	 */
	List<User> findAllUsers();
	
	
	/**
	 * 删除所有的User信息
	 * 
	 * @author moon  2019/10/17  17:04
	 */
	void deleteAllUser();
	
	
	/**
	 * 判断 User 是否存在
	 * 
	 * @param user
	 * @return
	 * 
	 * @author moon  2019/10/17  17:05
	 */
	public boolean isUserExist(User user);
	
	
}
