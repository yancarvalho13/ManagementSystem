package com.NetProject.BackEnd.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "users")
@Entity(name = "User")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Nome Obrigatorio")
    private String nome;

    @NotBlank(message = "Email Obrigatorio")
    private String email;

    @NotBlank(message = "Dado Obrigatorio")
    private String empresa;

    @NotBlank(message = "Dado Obrigatorio")
    private String telefone;


}
