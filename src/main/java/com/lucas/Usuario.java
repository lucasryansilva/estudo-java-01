package com.lucas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //Gera o constructor
public class Usuario {

    private String name;
    private String cpf;
    private String date;
    private String email;
    private String password;

}
