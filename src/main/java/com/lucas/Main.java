package com.lucas;

import com.lucas.database.UsuarioDAO;
import com.lucas.services.MenuPrincipal;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Main {

    //A chave do Map é o CPF (Porque não pode ser duplicado).
    @Getter private static final Map<String, Usuario> ListUsers = new HashMap<>();

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //Carrega todos os usuários da tabela e manda para a HashMap.
        for (Usuario allUsers : usuarioDAO.listarTodos()) {
            ListUsers.put(allUsers.getCpf(), allUsers);
        }

        new MenuPrincipal().iniciar();
    }
}