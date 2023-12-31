package org.ecollfelipe.ecoparametros.model;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor @NoArgsConstructor
@Data
@ValidarClave
public class DatosFormulario {
    @NotBlank
    private String nombre;
    @Size(min = 6,max = 12, message = "La contraseña tiene que se entre 6 y 12 caracteres.")
    @Pattern(regexp ="(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\p{Punct})[A-Za-z\\d\\p{Punct}]", message = "la contraseĆ±a no es valida.")
    private String clave;
    @NotBlank
    private String confirmarClave;
    @NotEmpty
    private String genero;
    @NotBlank
    private LocalDate fechaNacimiento;
    @NotNull
    private Integer edad;
    @NotNull
    private String email;
    @NotNull
    private String url;
    @NotBlank
    private String siglasPais;
    @NotNull
    private List<String> archivos;
    @NotNull
    private List<String> aficionesSelecionadas;
    @NotNull
    private String comentarios;
}
