package com.altin.springboot.postgresql.hibernate.repository;

import com.altin.springboot.postgresql.hibernate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
