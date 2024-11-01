package gr.aueb.cf.schoolapp.model;


import gr.aueb.cf.schoolapp.model.static_data.EducationalUnit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "employees")
public class Employee extends AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "is_active")

    private Boolean isActive;

    @Column(unique = true)

    private String uuid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToMany
    @JoinTable(name = "employees_edu_units")
    private Set<EducationalUnit> eduUnits = new HashSet<>();

    public void addEducationalUnit(EducationalUnit educationalUnit) {
        if (eduUnits == null) eduUnits = new HashSet<>();
        eduUnits.add(educationalUnit);
    }

    public boolean hasEducationalUnits() {
        return eduUnits != null && eduUnits.isEmpty();
    }


    @PrePersist
    public void initializeUUID() {
        if (uuid == null) uuid = UUID.randomUUID().toString();
    }



}
