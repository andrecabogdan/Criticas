/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.usuariosCriticas.service;

import es.uah.usuariosCriticas.model.Usuario;
import java.util.List;

/**
 *
 * @author Bogdan
 */
public interface IUsuariosService {

    List<Usuario> buscarTodos();

    Usuario buscarUsuarioPorId(Integer idUsuario);

    List<Usuario> buscarUsuarioPorNombre(String nombre);

    List<Usuario> buscarUsuarioPorCorreo(String correo);

    Usuario buscarUsuarioPorCorreoClave(String correo, String clave);

    void guardarUsuario(Usuario usuario);

    void eliminarUsuario(Integer idUsuario);

    void actualizarUsuario(Usuario usuario);

    void eliminarCritica(Integer idUsuario, Integer idCritica);

}
