package controleFuncionarios.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import controleFuncionarios.dao.EmployeeDao;
import controleFuncionarios.entity.Employee;

@Component
@ViewScoped
public class EmployeeControl {

	@Autowired
	private EmployeeDao employerDao;

	private Employee employee = new Employee();

	private List<Employee> employees = new ArrayList<>();

	@PostConstruct
	private void init() {
		list();
	}

	public EmployeeControl() {
	}

	public EmployeeDao getEmployerDao() {
		return employerDao;
	}

	public void setEmployerDao(EmployeeDao employerDao) {
		this.employerDao = employerDao;
	}

	public Employee getEmployer() {
		return employee;
	}

	public void setEmployer(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployers() {
		return employees;
	}

	public void setEmployers(List<Employee> employees) {
		this.employees = employees;
	}

	private void list() {
		this.employees = employerDao.findAll();
	}

	public void save() {
		this.employerDao.save(this.employee);
		list();
	}
}
