package com.moon.mvc.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moon.mvc.pojo.Employee;
import com.moon.mvc.service.EmployeeService;


@Controller
@RequestMapping("/")
public class AppController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	MessageSource messageSource;
	
	
	/**
	 * 查询所有 Employee 信息.
	 * 
	 * @param model
	 * @return
	 * 
	 * @author moon  2019/11/12  17:13
	 */
	@RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {
		
		List<Employee> employeeList= employeeService.findAllEmployees();
		model.addAttribute("employees", employeeList);
		
		return "allemployees";
	}
	
	
	/**
	 * 新增 Employee
	 * 
	 * @param model
	 * @return
	 * 
	 * @author moon  2019/11/02  17:20
	 */
	@RequestMapping(value = {"/new"}, method = RequestMethod.GET)
	public String newEmployee(ModelMap model) {
		
		Employee employee = new Employee();
		
		model.addAttribute("employee", employee);
		model.addAttribute("edit", false);
		
		return "registration";
	}
	
	
	/**
	 * 此方法将在表单提交时调用，处理将雇员保存到数据库中的POST请求。它还验证用户输入。
	 * 
	 * @param employee
	 * @param result
	 * @param model
	 * @return
	 * 
	 * @author moon  2019/11/02  17:25
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee, BindingResult result, ModelMap model) {
		
		if (result.hasErrors()) {
			return "registration";
		}
		
		
		/**
		 * Preferred way to achieve uniqueness of field [ssn] should be implementing custom @Unique annotation 
		 * and applying it on field [ssn] of Model class [Employee].
		 * 
		 * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
		 * framework as well while still using internationalized messages.
		 * 
		 */
		if (!employeeService.isEmployeeSsnUnique(employee.getId(), employee.getSsn())) {
			
			FieldError ssnError = new FieldError("employee", "ssn", messageSource.getMessage("non.unique.ssn", new String[] { employee.getSsn() }, Locale.getDefault() ) );
			result.addError(ssnError);
			
			return "registration";
		}
		
		employeeService.saveEmployee(employee);
		
		model.addAttribute("success", "Employee" + employee.getName() + "registered successfully");
		
		return "success";
	}
	
	
	/**
	 * This method will provide the medium to update an existing employee.
	 * 
	 * @param ssn
	 * @param model
	 * @return
	 * 
	 * @author moon  2019/11/02  17:54
	 */
	@RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.GET)
	public String editEmployee(@PathVariable String ssn, ModelMap model) {
		
		Employee employee = employeeService.findEmployeeBySsn(ssn);
		model.addAttribute("employee", employee);
		model.addAttribute("edit", true);
		
		return "registration";
	}
	
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating employee in database. It also validates the user input.
	 * 
	 * @param employee
	 * @param result
	 * @param model
	 * @param ssn
	 * @return
	 * 
	 * @author moon  2019/11/02  18:17
	 */
	@RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.POST)
	public String updateEmployee(@Valid Employee employee, BindingResult result, ModelMap model, @PathVariable String ssn) {
		
		if (result.hasErrors()) {
			return "registration";
		}
		
		if ( !employeeService.isEmployeeSsnUnique(employee.getId(), employee.getSsn()) ) {
			
			FieldError ssnError = new FieldError("employee", "ssn", messageSource.getMessage("non.unique.ssn", new String[] {employee.getSsn()}, Locale.getDefault()) );
			
			result.addError(ssnError);
			
			return "registration";
		}
		
		employeeService.updateEmployee(employee);
		model.addAttribute("success", "Employee" + employee.getName() + "updated successfully.");
		
		return "success";
	} 
	
	
	/**
	 * This method will delete an employee by it's SSN value.
	 * 
	 * @param ssn
	 * @return
	 * 
	 * @author moon  2019/11/07  11:34
	 */
	@RequestMapping(value = { "/delete-{ssn}-employee" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable String ssn) {
		
		employeeService.deleteEmployeeBySsn(ssn);
		
		return "redirect:/list";
	}
	
	
}
