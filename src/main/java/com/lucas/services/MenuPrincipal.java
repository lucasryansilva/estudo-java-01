package com.lucas.services;

import java.util.Scanner;

public class MenuPrincipal {
    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        System.out.println(
                " \n Selecione o que você deseja fazer: \n" +
                        " º Digite 1 para logar no sistema; \n" +
                        " º Digite 2 para se registrar no sistema; \n" +
                        " º Digite 3 para buscar por um usuário no sistema. \n ");
        int opcoes = scanner.nextInt();

        switch (opcoes) {
            case 1 -> new MenuLogar().logar();
            case 2 -> new MenuRegistrar().registrar();
            case 3 -> new MenuProcurar().procurar();
            default -> System.out.println("Essa opção não existe!");
        }
    }
}
