package com.moon.mvc.dao;

import java.util.List;

import com.moon.mvc.pojo.Employee;

public interface EmployeeDao {
	
	/**
	 * 通过主键查询 Employee 信息
	 * 
	 * @param id
	 * @return
	 * 
	 * @author moon  2019/11/02  11:40
	 */
	Employee findById(int id);
	
	
	/**
	 * 新增 Employee 信息
	 * 
	 * @param employee
	 * 
	 * @author moon  2019/11/02  11:43
	 */
	void saveEmployee(Employee employee);
	
	
	/**
	 * 删除 Employee 信息
	 * 
	 * @param ssn
	 * 
	 * @author moon  2019/11/02  11:43
	 */
	void deleteEmployeeBySsn(String ssn);
	
	
	/**
	 * 查询所有 Employee 信息
	 * 
	 * @return
	 * 
	 * @author moon  2019/11/02  11:44
	 */
	List<Employee> findAllEmployees();
	
	
	/**
	 * 通过 ssn 查询 Employee 信息
	 * 
	 * @param ssn
	 * @return
	 * 
	 * @author moon  2019/11/02  11:48
	 */
	Employee findEmployeeBySsn(String ssn);
	
}
