package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherInsertDTO {

    @NotNull(message = "Is active must not be null")
    private Boolean  isActive;

    @NotNull(message = "User details must not be null")
    private UserInsertDTO user;

    @NotNull(message = "Personal info must not be null")
    private PersonalInfoInsertDTO personalInfo;
}
