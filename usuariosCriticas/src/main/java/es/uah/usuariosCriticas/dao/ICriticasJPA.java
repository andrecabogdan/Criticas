/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.usuariosCriticas.dao;

import es.uah.usuariosCriticas.model.Critica;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 *
 * @author Bogdan
 */
public interface ICriticasJPA extends JpaRepository<Critica, Integer> {

    List<Critica> findByIdPelicula(int idPelicula);

}

