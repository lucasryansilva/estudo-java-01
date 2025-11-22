package com.lucas.services;

import com.lucas.Usuario;
import com.lucas.database.UsuarioDAO;

import java.util.Scanner;

public class MenuRegistrar {
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();
    private final Scanner scanner = new Scanner(System.in);

    public void registrar() {
        System.out.println("Por favor, digite as informações do usuário \n ");

        System.out.println("Qual o nome do usuário?");
        String name = scanner.nextLine();

        System.out.println("Qual o cpf do usuário?");
        String cpf = scanner.nextLine();

        System.out.println("Qual a data de nascimento do usuário?");
        String date = scanner.nextLine();

        System.out.println("Qual o e-mail do usuário?");
        String email = scanner.nextLine();

        System.out.println("Qual a senha você quer criar para o usuário?");
        System.out.println("(Essa senha é temporária e pode ser alterada!)");
        String password = scanner.nextLine();

        Usuario usuarios = new Usuario(name, cpf, date, email, password);

        System.out.println(" \n Informações do registro criado: \n");
        System.out.println(
                " Nome: " + usuarios.getName() +
                        " CPF: " + usuarios.getCpf() +
                        " Data: " + usuarios.getDate() +
                        " E-mail: " + usuarios.getEmail() +
                        " Senha: " + usuarios.getPassword());
        usuarioDAO.salvar(usuarios);
    }
}
