package iuh.baitap1.services;

import iuh.baitap1.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public void save(Employee employee);
    public Employee findById(Integer id);
    public List<Employee> findAll();
}
