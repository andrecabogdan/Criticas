/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.usuariosCriticas.controller;

import es.uah.usuariosCriticas.model.Rol;
import es.uah.usuariosCriticas.service.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 *
 * @author Bogdan
 */
@RestController
public class RolesController {
        @Autowired
    IRolesService rolesService;

    @GetMapping("/roles")
    public List<Rol> buscarTodos() {
        return rolesService.buscarTodos();
    }

    @GetMapping("/roles/{id}")
    public Rol buscarRolPorId(@PathVariable("id") Integer id) {
        return rolesService.buscarRolPorId(id);
    }

    @PostMapping("/roles")
    public void guardarRol(@RequestBody Rol rol) {
        rolesService.guardarRol(rol);
    }

    @DeleteMapping("/roles/{id}")
    public void eliminarRol(@PathVariable("id") Integer id) {
        rolesService.eliminarRol(id);
    }
}
