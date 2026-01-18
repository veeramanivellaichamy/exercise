package com.test.exercise.processor;

import com.test.exercise.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CodingTest {
    public List<Employee> getNameList() {
        List<Employee> employees = initValues();
        return employees;
    }
    public List<Employee> initValues(){
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee1 = new Employee();
        employee1.setFirstName("Veeramani");
        employee1.setLastName("Vellaichamy");
        employee1.setCountry("India");
        employee1.setPostalCode("12345");
        employee1.setEmail("vmanipln@gmail.com");
        employee1.setAddress("Perumbakkam");
        employee1.setPhoneNumber("4321");
        employee1.setEmployeeId("1");
        employee1.setState("Tamilnadu");
        Employee employee2 = new Employee();
        employee2.setFirstName("Sudha");
        employee2.setLastName("Shanmugavel");
        employee2.setCountry("US");
        employee2.setPostalCode("75038");
        employee2.setEmail("sudhashanmugavel@gmail.com");
        employee2.setAddress("Irving");
        employee2.setPhoneNumber("1234");
        employee2.setEmployeeId("2");
        employee2.setState("Texas");
        Employee employee3 = new Employee();
        employee3.setFirstName("Sujanth");
        employee3.setLastName("Veeramani Sudha");
        employee3.setCountry("India");
        employee3.setPostalCode("12345");
        employee3.setEmail("sujanth@gmail.com");
        employee3.setAddress("Perumbakkam");
        employee3.setPhoneNumber("242342");
        employee3.setEmployeeId("3");
        employee3.setState("Tamilnadu");
        Employee employee4 = new Employee();
        employee4.setFirstName("Kavin");
        employee4.setLastName("Veeramani Sudha");
        employee4.setCountry("India");
        employee4.setPostalCode("12345");
        employee4.setEmail("vmanipln@gmail.com");
        employee4.setAddress("Perumbakkam");
        employee4.setPhoneNumber("4321");
        employee4.setEmployeeId("4");
        employee4.setState("Tamilnadu");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        return employees;
    }
}
