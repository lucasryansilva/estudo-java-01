package com.lucas.services;

import com.lucas.Main;
import com.lucas.Usuario;

import java.util.Scanner;

public class MenuLogar {

    public void logar() {

        System.out.println(" \n Por favor, digite o seu CPF: \n ");

        Scanner scanner = new Scanner(System.in);

        String cpf = scanner.nextLine();
        String cpfNormalizado = cpf.replaceAll("\\D", ""); //Remove tudo que não foi número.
        if (!Main.getListUsers().containsKey(cpfNormalizado)) {
            System.out.println("Esse CPF não foi encontrado!");
            return;
        }

        Usuario usuario = Main.getListUsers().get(cpfNormalizado);

        System.out.println(" \n Digite o seu e-mail:");
        String email = scanner.nextLine();
        if (!usuario.getEmail().contains(email)) {
            System.out.println("Esse E-mail não foi encontrado!");
            return;
        }

        System.out.println(" \n Digite a sua senha:");
        String password = scanner.nextLine();
        if (!usuario.getPassword().equals(password)) {
            System.out.println("Senha incorreta!");
            return;
        }

        System.out.println(" \n Olá (" + usuario.getName() + ") você logou com sucesso!");
    }
}
