package iuh.fit.bai1.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
@Setter
public class Employee {
    private Integer id;
    private String name;
    private String role;
}
