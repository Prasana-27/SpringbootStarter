package com.prasana.springBoot.service;

import com.prasana.springBoot.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDept();

    Department getADept(Long deptID);

    void deleteADept(Long deptID);

    Department updateDept(Long deptID, Department department);

    Department getDepartmentbyName(String name);
}
