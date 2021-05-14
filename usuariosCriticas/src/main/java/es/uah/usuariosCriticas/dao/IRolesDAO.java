package es.uah.usuariosCriticas.dao;

import es.uah.usuariosCriticas.model.Critica;
import es.uah.usuariosCriticas.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRolesDAO {

    List<Rol> buscarTodos();

    Rol buscarRolPorId(Integer idRol);

    void guardarRol(Rol rol);

    void eliminarRol(Integer idRol);

}
