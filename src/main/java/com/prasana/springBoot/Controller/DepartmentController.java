package com.prasana.springBoot.Controller;

import com.prasana.springBoot.entity.Department;
import com.prasana.springBoot.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

        private final Logger  LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
        public DepartmentService departmentService;



        @PostMapping("/departments")
        public Department saveDepartment(@Valid @RequestBody Department department){
            LOGGER.info("Inside Save Department of Department Controller" );
            return departmentService.saveDepartment(department);

        }

        @GetMapping("/getDepartments")
        public List<Department> getDepartment(){
             return departmentService.getAllDept();
        }

        @GetMapping("/getDepartments/{id}")
        public Department getSingleDepartment( @PathVariable ("id") Long DeptID){
            return departmentService.getADept(DeptID);
        }

        @DeleteMapping("/getDepartments/{id}")
        public String deleteDept( @PathVariable ("id") Long DeptID){
            Department dept = getSingleDepartment(DeptID);
            String result = dept.toString()+"WILL BE DELETED";
            departmentService.deleteADept(DeptID);
            return "Deleted Department "+result ;
        }

        @PutMapping("/getDepartments/{id}")
        public Department updateDepartment(@PathVariable ("id") Long DeptID , @RequestBody  Department department) {
            return departmentService.updateDept(DeptID,department);
        }


    @GetMapping("/getDepartments/name/{name}")
    public Department getDepartmentbyName( @PathVariable ("name") String name){
        return departmentService.getDepartmentbyName(name);
    }
}
