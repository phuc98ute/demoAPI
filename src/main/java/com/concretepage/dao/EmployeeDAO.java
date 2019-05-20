package com.concretepage.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import com.concretepage.model.Employee;
import org.springframework.stereotype.Repository;
 
@Repository
public class EmployeeDAO {
 
    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Employee emp1 = new Employee("BH01", "Hong Nhan", "Jack","POP","https://mp3-s1-zmp3.zadn.vn/0287cab2fef517ab4ee4/4725938721176572736?authen=exp=1558400403~acl=/0287cab2fef517ab4ee4/*~hmac=d1a4dc02c5862d6b65fee858f1d55a68&filename=Hong-Nhan-Jack.mp3");
        Employee emp2 = new Employee("BH02", "Bac Phan", "Jack","POP","https://mp3-s1-zmp3.zadn.vn/60d1145d3b1ad2448b0b/6176654472241979692?authen=exp=1558400254~acl=/60d1145d3b1ad2448b0b/*~hmac=ca0d5a7e87e094fc8be66dd585a2da4b&filename=Bac-Phan-Jack-K-ICM.mp3");
        Employee emp3 = new Employee("BH03", "Anh ơi ở lại", "Chi Pu","POP","https://mp3-s1-zmp3.zadn.vn/27d8b4be9bf972a72be8/2815297979810517552?authen=exp=1558400247~acl=/27d8b4be9bf972a72be8/*~hmac=8e7309474c3b9768f44c258a8c517130&filename=Anh-Oi-O-Lai-Chi-Pu-Dat-G.mp3");
        empMap.put(emp1.getId(), emp1);
        empMap.put(emp2.getId(), emp2);
        empMap.put(emp3.getId(), emp3);
    }
 
    public Employee getEmployee(String empNo) {
        return empMap.get(empNo);
    }
 
    
 
    public List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }
 
}