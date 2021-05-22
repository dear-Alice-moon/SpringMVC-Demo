package com.moon.mvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
// import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import com.moon.mvc.pojo.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {
	
	/**
	 * 通过主键查询 Employee 信息
	 * 
	 * @param id
	 * @return
	 * 
	 * @author moon  2019/11/02  11:40
	 */
	public Employee findById(int id) {
		
		return getByKey(id);
	}
	
	
	/**
	 * 新增 Employee 信息
	 * 
	 * @param employee
	 * 
	 * @author moon  2019/11/02  11:43
	 */
	public void saveEmployee(Employee employee) {
		
		persist(employee);
	}
	
	
	/**
	 * 删除 Employee 信息
	 * 
	 * @param ssn
	 * 
	 * @author moon  2019/11/02  11:43
	 */
	@SuppressWarnings({ "rawtypes", "deprecation" })  // 该注解是否需要注释？？？？
	public void deleteEmployeeBySsn(String ssn) {
		Query query = getSession().createSQLQuery("DELETE FROM employee WHERE ssn = :ssn");
		query.setString("ssn", ssn);
		query.executeUpdate();
	}
	
	
	/**
	 * 查询所有 Employee 信息
	 * 
	 * @return
	 * 
	 * @author moon  2019/11/02  11:44
	 */
	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployees() {
		
		Criteria criteria = createEntityCriteria();
		return (List<Employee>) criteria.list();
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
		
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("ssn", ssn));
		
		return (Employee) criteria.uniqueResult();
	}
	
}
