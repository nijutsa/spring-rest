package gr.aueb.cf.schoolapp.model.static_data;


import gr.aueb.cf.schoolapp.model.Employee;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "educational_units")
public class EducationalUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @Getter(AccessLevel.PRIVATE)
    @ManyToMany(mappedBy = "eduUnits")
    private Set<Employee> employees = new HashSet<>();



}


