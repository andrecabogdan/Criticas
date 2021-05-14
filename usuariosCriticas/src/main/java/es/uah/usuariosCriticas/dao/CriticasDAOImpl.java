/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.usuariosCriticas.dao;

import es.uah.usuariosCriticas.model.Critica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Bogdan
 */
@Repository
public class CriticasDAOImpl implements ICriticasDAO {

    @Autowired
    ICriticasJPA criticasJPA;

    @Override
    public List<Critica> buscarTodas() {
        return criticasJPA.findAll();
    }

    @Override
    public List<Critica> buscarCriticasPorIdPelicula(Integer idPeliccula) {
        return criticasJPA.findByIdPelicula(idPeliccula);
    }

    @Override
    public Critica buscarCriticaPorId(Integer idCritica) {
        Optional<Critica> optional = criticasJPA.findById(idCritica);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public void guardarCritica(Critica critica) {
        criticasJPA.save(critica);
    }

    @Override
    public void eliminarCritica(Integer idCritica) {
        criticasJPA.deleteById(idCritica);
    }

}
