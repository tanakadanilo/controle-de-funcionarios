package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
