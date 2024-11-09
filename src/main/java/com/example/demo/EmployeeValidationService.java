package com.example.demo;
import java.util.List;

public class EmployeeValidationService {
    public boolean validateUniquePassport(Employee employee,
                                          List<Employee> employees) {
        return employees.stream().noneMatch(e ->
                e.getPassportNumber().equals(employee.getPassportNumber()));
    }
    public boolean validateUniqueEmail(Employee employee,
                                       List<Employee> employees) {
        return employees.stream().noneMatch(e ->
                e.getEmail().equals(employee.getEmail()));
    }
    public boolean validateAge(Employee employee) {
        return employee.getAge() >= 18;
    }
}
