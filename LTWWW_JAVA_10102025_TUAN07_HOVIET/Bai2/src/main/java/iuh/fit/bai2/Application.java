package iuh.fit.bai2;

import iuh.fit.bai2.model.Employee;
import iuh.fit.bai2.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Bean
    CommandLineRunner run(EmployeeRepository repo){
        return args -> {
            System.out.println("=== THÊM NHÂN VIÊN ===");
            repo.save(new Employee(null, "Nguyen Van A", "admin"));
            repo.save(new Employee(null, "Nguyen Van B", "staff"));
            System.out.println("\n=== DANH SÁCH NHÂN VIÊN ===");
            repo.findAll().forEach(System.out::println);
            System.out.println("\n=== TÌM THEO ID ===");
            repo.findById(1).ifPresent(System.out::println);
            System.out.println("\n=== CẬP NHẬT ===");
            Employee employee = repo.findById(2).orElseThrow();
            employee.setName("Nguyen Thi A");
            repo.save(employee);
            System.out.println("Đã cập nhật: " + employee);
            System.out.println("\n=== XOÁ NHÂN VIÊN ID=1 ===");
            repo.deleteById(1);
            repo.findAll().forEach(System.out::println);
        };
    }

}
