package iuh.fit.bai1.dao;

import iuh.fit.bai1.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    void save(Employee employee);
    List<Employee> getAll();
    Employee getById(int id);
    Employee getByDirectMapper(int id);
    void update(Employee employee);
    void delete(int id);
}
