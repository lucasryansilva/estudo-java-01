package com.lucas.database;

import com.lucas.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    //Informações para criar a conexão.
    private static final String URL = "jdbc:postgresql://localhost:5432/aula01";
    private static final String USER = "postgres";
    private static final String PASSWORD = "lucas2003";


    // Salva os usuários criados na tabela.
    public void salvar(Usuario usuario) {
        String sql = "INSERT INTO usuarios (name, cpf, date, email, password) VALUES (?, ?, ?, ?, ?)";

        //Tenta criar a conexão.
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getName());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getDate());
            stmt.setString(4, usuario.getEmail());
            stmt.setString(5, usuario.getPassword());

            stmt.executeUpdate();
            System.out.println("O usuário (" + usuario.getName() + ") foi registrado!");
        } catch (Exception e) {
            System.out.println("Não foi possível registrar o usuário (" + usuario.getName() + "), tente novamente!");
            e.printStackTrace();
        }
    }

    // Carrega todos os usuários do banco de dados para essa lista.
    public List<Usuario> listarTodos() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getString("name"),
                        rs.getString("cpf"),
                        rs.getString("date"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }

}
