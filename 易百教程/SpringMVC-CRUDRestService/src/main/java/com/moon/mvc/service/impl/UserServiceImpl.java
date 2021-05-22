package com.moon.mvc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.moon.mvc.pojo.User;
import com.moon.mvc.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> userList;
	
	
	/**
	 * 通过静态代码块给 userList 赋值 
	 */
	static {  
		
		userList = populateDummyUsers();
	}
	
	
	/**
	 * 通过id查找 User
	 * 
	 * @param id
	 * @return
	 * 
	 * @author moon  2019/10/17  16:57
	 */
	public User findUserById(Long id) {
		
		for (User user : userList) {
			if (user.getId().equals(id)) {
				
				System.out.println("-------- 通过ID查找到User --------");
				return user;
			}
		}
		
		System.out.println("-------- 通过ID未查找到User --------");
		return null;
	}
	
	
	/**
	 * 通过'姓名'查找User
	 * 
	 * @param name
	 * @return
	 * 
	 * @author moon  2019/10/17  16:59
	 */
	public User findUserByName(String name) {
		
		for (User user : userList) {
			
			if (user.getName().equals(name)) {
				
				System.out.println("-------- 通过姓名查找到User --------");
				return user;
			}
		}
		
		System.out.println("-------- 通过姓名未查找到User --------");
		return null;
	}
	
	
	/**
	 * 新增User
	 * 
	 * @param user
	 * 
	 * @author moon  2019/10/17  17:00
	 */
	public void saveUser(User user) {
		
		// user.setId(new Long(counter.incrementAndGet()));
		
		userList.add(user);
		System.out.println("-------- 添加数据成功  --------");
	}
	
	
	/**
	 * 更新User
	 * 
	 * @param user
	 * 
	 * @author moon  2019/10/17  17:01
	 */
	public void updateUser(User user) {
		
		int index = userList.indexOf(user);
		
		System.out.println("-------- 更新User成功 --------");
		userList.add(index, user);
	}
	
	
	/**
	 * 通过 Id 删除 User
	 * 
	 * @param id
	 * 
	 * @author moon  2019/10/17  17:02
	 */
	public void deleteUserById(Long id) {
		
		System.out.println("删除前，userList为：" + JSONObject.toJSONString(userList));
		
		for (Iterator<User> iterator = userList.iterator(); iterator.hasNext(); ) {
			
			User user = iterator.next();
			
			if (user.getId().equals(id)) {
				iterator.remove();
				System.out.println("-------- 删除数据成功 --------");
			}
		}
		
		System.out.println("删除后，userList为：" + JSONObject.toJSONString(userList));
	}
	
	
	/**
	 * 查询所有的User信息
	 * 
	 * @return
	 * 
	 * @author moon  2019/10/17  17:03
	 */
	public List<User> findAllUsers() {
		
		System.out.println("-------- 查询出所有的User --------");
		return userList;
	}
	
	
	/**
	 * 删除所有的User信息
	 * 
	 * @author moon  2019/10/17  17:04
	 */
	public void deleteAllUser() {
		
		System.out.println("-------- 删除所有User信息 --------");
		userList.clear();
	}
	
	
	/**
	 * 判断 User 是否存在
	 * 
	 * @param user
	 * @return
	 * 
	 * @author moon  2019/10/17  17:05
	 */
	public boolean isUserExist(User user) {
		
		return findUserByName(user.getName()) != null;
	}
	
	
	/**
	 * 制造一些User数据
	 * 
	 * @return
	 */
	private static List<User> populateDummyUsers() {
		
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User( new Long(counter.incrementAndGet()), "Sam", new Integer(30), new BigDecimal(7000) ) );
		userList.add(new User( new Long(counter.incrementAndGet()), "Tom", new Integer(40), new BigDecimal(5000) ) );
		userList.add(new User( new Long(counter.incrementAndGet()), "Jerome", new Integer(45), new BigDecimal(4000) ) );
		userList.add(new User( new Long(counter.incrementAndGet()), "Silvia", new Integer(50), new BigDecimal(3000) ) );
		
		
		return userList;
	}
	
	
}
