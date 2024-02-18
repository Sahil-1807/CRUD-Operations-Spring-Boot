package com.eCommerce.springbootbackend.repository;

import com.eCommerce.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //we dont have to specify the annotation @repository as jpaRepository internally provide this annotation
}
