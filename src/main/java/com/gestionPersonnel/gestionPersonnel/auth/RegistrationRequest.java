package com.gestionPersonnel.gestionPersonnel.auth;


import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "La saisie du prénom est obligatoire")
    @NotBlank(message = "La saisie du prénom est obligatoire")
    private String firstname;

    @NotEmpty(message = "La saisie du nom est obligatoire")
    @NotBlank(message = "La saisie du nom est obligatoire")
    private String lastname;

    @NotNull(message = "La date de naissance est obligatoire")
    @Past(message = "La date de naissance doit être dans le passé")
    private LocalDate dateOfBirth;

    @Email(message = "L'email n'est pas correctement formaté")
    @NotEmpty(message = "La saisie d'adresse mail est obligatoire")
    @NotBlank(message = "La saisie d'adresse mail est obligatoire")
    private String email;

    @Size(min = 8, message = "Le mot de passe doit contenir au minimum 8 caractère")
    @NotEmpty(message = "Le mot de passe est obligatoire")
    @NotBlank(message = "Le mot de passe est obligatoire")
    private String password;
}
