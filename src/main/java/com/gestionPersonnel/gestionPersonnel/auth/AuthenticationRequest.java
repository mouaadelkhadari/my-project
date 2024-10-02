package com.gestionPersonnel.gestionPersonnel.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class AuthenticationRequest {

    @Email(message = "L'email n'est pas correctement formaté")
    @NotEmpty(message = "La saisie d'adresse mail est obligatoire")
    @NotBlank(message = "La saisie d'adresse mail est obligatoire")
    private String email;
    @Size(min = 8, message = "Le mot de passe doit contenir au minimum 8 caractère")
    @NotEmpty(message = "Le mot de passe est obligatoire")
    @NotBlank(message = "Le mot de passe est obligatoire")
    private String password;
}
