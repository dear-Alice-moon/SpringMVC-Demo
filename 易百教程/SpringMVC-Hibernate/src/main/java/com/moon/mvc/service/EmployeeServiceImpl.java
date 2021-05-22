package com.moon.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moon.mvc.dao.EmployeeDao;
import com.moon.mvc.pojo.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	/**
	 * 通过主键查询 Employee 信息
	 * 
	 * @param id
	 * @return
	 * 
	 * @author moon  2019/11/02  11:40
	 */
	public Employee findById(int id) {
		
		return employeeDao.findById(id);
	}
	
	
	/**
	 * 新增 Employee 信息
	 * 
	 * @param employee
	 * 
	 * @author moon  2019/11/02  11:43
	 */
	public void saveEmployee(Employee employee) {
		
		employeeDao.saveEmployee(employee);
	}
	
	
	/**
	 * 更新 Employee 信息
	 * 
	 * @param employee
	 * 
	 * @author moon  2019/11/02  15:44
	 */
	public void updateEmployee(Employee employee) {
		
		Employee entity = employeeDao.findById(employee.getId());
		
		if (entity != null) {
			entity.setName(employee.getName());
			entity.setJoiningDate(employee.getJoiningDate());
			entity.setSalary(employee.getSalary());
			entity.setSsn(employee.getSsn());
		}
		
	}
	
	
	/**
	 * 删除 Employee 信息
	 * 
	 * @param ssn
	 * 
	 * @author moon  2019/11/02  11:43
	 */
	public void deleteEmployeeBySsn(String ssn) {
		
		employeeDao.deleteEmployeeBySsn(ssn);
	}
	
	
	/**
	 * 查询所有 Employee 信息
	 * 
	 * @return
	 * 
	 * @author moon  2019/11/02  11:44
	 */
	public List<Employee> findAllEmployees() {
		
		return employeeDao.findAllEmployees();
	}
	
	
	/**
	 * 通过 ssn 查询 Employee 信息
	 * 
	 * @param ssn
	 * @return
	 * 
	 * @author moon  2019/11/02  11:48
	 */
	public Employee findEmployeeBySsn(String ssn) {
		
		return employeeDao.findEmployeeBySsn(ssn);
	}
	
	
	/**
	 * 判断 Employee 是否通过 ssn 相连.
	 * 
	 * @param id
	 * @param ssn
	 * @return
	 * 
	 * @author moon  2019/11/02  15:42
	 */
	public boolean isEmployeeSsnUnique(Integer id, String ssn) {
		
		Employee employee = findEmployeeBySsn(ssn);
		
		return ( employee == null || ((id != null) && (employee.getId() == id)) );
	}
	
	
}
