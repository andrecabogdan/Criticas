/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.usuariosCriticas.service;

import es.uah.usuariosCriticas.dao.ICriticasDAO;
import es.uah.usuariosCriticas.model.Critica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *
 * @author Bogdan
 */
@Service
public class CriticasServiceImpl implements ICriticasService {

    @Autowired
    ICriticasDAO criticasDAO;

    @Override
    public List<Critica> buscarTodas() {
        return criticasDAO.buscarTodas();
    }

    @Override
    public List<Critica> buscarCriticasPorIdPelicula(Integer idPelicula) {
        return criticasDAO.buscarCriticasPorIdPelicula(idPelicula);
    }

    @Override
    public Critica buscarCriticaPorId(Integer idMatricula) {
        return criticasDAO.buscarCriticaPorId(idMatricula);
    }

    @Override
    public void guardarCritica(Critica critica) {
        criticasDAO.guardarCritica(critica);
    }

    @Override
    public void eliminarCritica(Integer idCritica) {
        criticasDAO.eliminarCritica(idCritica);
    }

}
