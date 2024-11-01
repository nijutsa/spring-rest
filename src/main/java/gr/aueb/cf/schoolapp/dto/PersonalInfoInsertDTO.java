package gr.aueb.cf.schoolapp.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonalInfoInsertDTO {

    @NotEmpty(message = "Amka must not be empty")
    @Pattern(regexp = "^\\d{11}$")
    private String amka;

    @NotEmpty(message = "Identity number must not be empty")
    private String identityNumber;
    @NotEmpty(message = "Place of birth must not be empty")
    private String placeOfBirth;
    @NotEmpty(message = "Municipality of registration must not be empty")
    private String municipalityOfRegistration;
}
