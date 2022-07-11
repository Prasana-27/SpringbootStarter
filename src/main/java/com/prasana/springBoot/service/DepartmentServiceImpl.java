package com.prasana.springBoot.service;

import com.prasana.springBoot.entity.Department;
import com.prasana.springBoot.respository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements  DepartmentService{


    @Autowired
    private DepartmentRepository repo;
    @Override
    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    @Override
    public List<Department> getAllDept() {
        return repo.findAll();
    }

    @Override
    public Department getADept(Long deptID) {
        return repo.findById(deptID).get();
    }

    @Override
    public void deleteADept(Long deptID) {
        repo.deleteById(deptID);
    }

    @Override
    public Department updateDept(Long deptID, Department department) {
       Department updateDept = repo.findById(deptID).get();

       if(Objects.nonNull(department.getDepartmentName())&&!"".equalsIgnoreCase(department.getDepartmentName())){
           updateDept.setDepartmentName(department.getDepartmentName());
       }
        if(Objects.nonNull(department.getAddress())&&!"".equalsIgnoreCase(department.getAddress())){
            updateDept.setAddress(department.getAddress());
        }

        return repo.save(updateDept);


    }

    @Override
    public Department getDepartmentbyName(String name) {
        return repo.findByDepartmentNameIgnoreCase(name);
    }
}
