/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.usuariosCriticas.controller;

import es.uah.usuariosCriticas.model.Usuario;
import es.uah.usuariosCriticas.service.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 *
 * @author Bogdan
 */
@RestController
public class UsuariosController {

    @Autowired
    IUsuariosService usuariosService;

    @GetMapping("/usuarios")
    public List<Usuario> buscarTodos() {
        return usuariosService.buscarTodos();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable("id") Integer id) {
        return usuariosService.buscarUsuarioPorId(id);
    }

    @GetMapping("/usuarios/correo/{correo}")
    public List<Usuario> buscarUsuarioPorCorreo(@PathVariable("correo") String correo) {
        return usuariosService.buscarUsuarioPorCorreo(correo);
    }

    @GetMapping("/usuarios/nombre/{nombre}")
    public List<Usuario> buscarUsuarioPorNombre(@PathVariable("nombre") String nombre) {
        return usuariosService.buscarUsuarioPorNombre(nombre);
    }

    @GetMapping("/usuarios/login/{correo}/{clave}")
    public Usuario buscarUsuarioPorCorreoConClave(@PathVariable("correo") String correo, @PathVariable("clave") String clave) {
        return usuariosService.buscarUsuarioPorCorreoClave(correo, clave);
    }

    @PostMapping("/usuarios")
    public void guardarUsuario(@RequestBody Usuario usuario) {
        usuariosService.guardarUsuario(usuario);
    }

    @PutMapping("/usuarios")
    public void actualizarUsuario(@RequestBody Usuario usuario) {
        usuariosService.actualizarUsuario(usuario);
    }

    @DeleteMapping("/usuarios/{id}")
    public void eliminarUsuario(@PathVariable("id") Integer id) {
        usuariosService.eliminarUsuario(id);
    }

}
