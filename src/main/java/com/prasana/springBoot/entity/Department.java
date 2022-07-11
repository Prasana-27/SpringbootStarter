package com.prasana.springBoot.entity;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentid;
   @NotBlank(message = "Department name cannot be left")
    private String departmentName;
    private String address;

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department(Long departmentid, String departmentName, String address) {
        this.departmentid = departmentid;
        this.departmentName = departmentName;
        this.address = address;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentid=" + departmentid +
                ", departmentName='" + departmentName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}



