package iuh.fit.bai1.dao.impl;

import iuh.fit.bai1.dao.EmployeeDAO;
import iuh.fit.bai1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Employee employee) {
        String sql = "INSERT INTO employees (name, role) VALUE(?,?)";
        jdbcTemplate.update(sql, employee.getName(), employee.getRole());
    }

    @Override
    public List<Employee> getAll() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
    }

    @Override
    public Employee getById(int id) {
        String sql = "SELECT * FROM employees WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), id);
    }

    @Override
    public Employee getByDirectMapper(int id) {
        String sql = "SELECT * FROM employees WHERE id=?";
        return jdbcTemplate.query(sql, rs ->{
            if (rs.next()){
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setRole(rs.getString("role"));
                return e;
            }
            return null;
        }, id);
    }

    @Override
    public void update(Employee employee) {
        String sql = "UPDATE employees SET name=?, role=? WHERE id=?";
        jdbcTemplate.update(sql, employee.getName(), employee.getRole(), employee.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM employees WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
