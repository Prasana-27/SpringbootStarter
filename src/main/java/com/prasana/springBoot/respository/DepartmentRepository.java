package com.prasana.springBoot.respository;

import com.prasana.springBoot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long>{

    public Department findByDepartmentNameIgnoreCase(String deptname);


}
