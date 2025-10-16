package iuh.fit.bai1;

import iuh.fit.bai1.dao.EmployeeDAO;
import iuh.fit.bai1.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication(scanBasePackages = {"iuh.fit.bai1.dao", "iuh.fit.bai1.dao.impl"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner(EmployeeDAO employeeDAO){
        return args -> {
            System.out.println("\n=== THÊM NHÂN VIÊN MỚI ===");
            Employee employee = Employee.builder()
                    .name("NguyenVanA")
                    .role("admin")
                    .build();
            employeeDAO.save(employee);

            System.out.println("\n=== DANH SÁCH NHÂN VIÊN ===");
            List<Employee> employees = employeeDAO.getAll();
            employees.forEach(System.out::println);

            System.out.println("\n=== TÌM THEO ID ===");
            System.out.println(employeeDAO.getById(1));

            System.out.println("\n=== GET BY ID (DIRECT MAPPER) ===");
            System.out.println(employeeDAO.getByDirectMapper(1));
        };
    }

}
