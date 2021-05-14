/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.usuariosCriticas.dao;

import es.uah.usuariosCriticas.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Bogdan
 */
public interface IUsuariosJPA extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByNombre(String nombre);

    List<Usuario> findByCorreo(String correo);

    Usuario findByCorreoAndClave(String correo, String clave);

}
