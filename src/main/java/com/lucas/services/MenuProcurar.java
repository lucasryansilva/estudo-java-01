package com.lucas.services;

import com.lucas.Main;
import com.lucas.Usuario;
import com.lucas.database.UsuarioDAO;

import java.util.Scanner;

public class MenuProcurar {
    private final Scanner scanner = new Scanner(System.in);

    public void procurar() {
        System.out.println(" \n Digite o cpf do usuário:");

        String cpf = scanner.nextLine();
        String cpfNormalizado = cpf.replaceAll("\\D", ""); //Remove tudo que não foi número.
        if (!Main.getListUsers().containsKey(cpfNormalizado)) {
            System.out.println(" Esse cpf não foi encontrado!");
            return;
        }

        Usuario usuario = Main.getListUsers().get(cpfNormalizado);

        System.out.println(
                " \n Informações sobre esse usuário: \n " +
                        " Nome: " + usuario.getName() +
                        " CPF: " + usuario.getCpf() +
                        " Data: " + usuario.getDate() +
                        " E-mail: " + usuario.getEmail() +
                        " Senha: " + usuario.getPassword());
    }
}
