package com.ricardo.exemplo_api_web.repository;

import com.ricardo.exemplo_api_web.handler.BusinessException;
import com.ricardo.exemplo_api_web.handler.CampoObrigatorioException;
import com.ricardo.exemplo_api_web.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    // Repositório Fake para exemplo
    public void save(Usuario usuario){
        // Exemplo de Exception com o Handler
        if(usuario.getLogin() == null)
            throw new CampoObrigatorioException("Login");

        if(usuario.getPassword() == null)
            throw new CampoObrigatorioException("Password");

        if(usuario.getId() == null)
            throw new CampoObrigatorioException("ID");

        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("ricardo","12345"));
        usuarios.add(new Usuario("usuario","senha"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.printf("GET/id - Recebendo o id: %d para localizar um usuário%n", id);
        return new Usuario("ricardo","12345");
    }

    public Usuario findByUsername(String username) {
        System.out.printf("GET/username - Recebendo o username: %s para localizar um usuário%n", username);
        return new Usuario("ricardo","12345");
    }
}
