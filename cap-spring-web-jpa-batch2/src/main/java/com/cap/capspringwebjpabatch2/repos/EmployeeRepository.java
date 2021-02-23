package com.cap.capspringwebjpabatch2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.capspringwebjpabatch2.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
