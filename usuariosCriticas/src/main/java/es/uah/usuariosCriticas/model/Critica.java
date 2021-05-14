/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.usuariosCriticas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Bogdan
 */
@Entity
@Table(name = "criticas", schema = "usuariosdbsec")
public class Critica implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCritica;

    private Integer idPelicula;

    private String valoracion;

    private Integer nota;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "Users_idUsuario", referencedColumnName = "idUsuario", nullable = false)
    @JsonIgnoreProperties("criticas")
    private Usuario usuario;

    public Critica() {
    }

    public Integer getIdCritica() {
        return idCritica;
    }

    public void setIdCritica(Integer idCritica) {
        this.idCritica = idCritica;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuariosByUsuariosIdUsuario) {
        this.usuario = usuariosByUsuariosIdUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Critica)) {
            return false;
        }
        Critica critica = (Critica) o;
        return Objects.equals(idCritica, critica.idCritica) && Objects.equals(idPelicula, critica.idPelicula) && Objects.equals(valoracion, critica.valoracion) && Objects.equals(nota, critica.nota) && Objects.equals(fecha, critica.fecha) && Objects.equals(usuario, critica.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCritica, idPelicula, valoracion, nota, fecha, usuario);
    }

}
