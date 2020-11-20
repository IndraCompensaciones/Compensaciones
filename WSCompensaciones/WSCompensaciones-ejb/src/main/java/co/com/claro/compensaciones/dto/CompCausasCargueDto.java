/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import co.com.claro.compensaciones.entity.CompCausas;
import co.com.claro.compensaciones.entity.CompOrigen;
import co.com.claro.compensaciones.entity.CompTipoOrigen;
import java.util.Date;

/**
 *
 * @author Administrador
 */
@ToString(callSuper = true, includeFieldNames = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CompCausasCargueDto {

    @Getter
    @Setter
    private String codigoAnomalia;
    @Getter
    @Setter
    private String DescripcionAnomalia;
    @Getter
    @Setter
    private String codigoProblema;
    @Getter
    @Setter
    private String descripcionProblema;
    @Getter
    @Setter
    private String codigoCausa;
    @Getter
    @Setter
    private String DescripcionCausa;
    @Getter
    @Setter
    private String origen;
    @Getter
    @Setter
    private String estado;
    @Getter
    @Setter
    private String tipo;
    @Getter
    @Setter
    private String internet;
    @Getter
    @Setter
    private String tv;
    @Getter
    @Setter
    private String telefonia;

    public CompCausas modificarObjeto(CompCausasCargueDto i) {
        CompOrigen compOrigen = new CompOrigen();
        CompTipoOrigen compTipoOrigen = new CompTipoOrigen();
        CompCausas causa = new CompCausas();
        compTipoOrigen.setIdTipoOrigen(Long.parseLong(i.getTipo()));
        causa.setIdTipoOrigen(compTipoOrigen);
        compOrigen.setIdOrigen(Long.parseLong(i.getOrigen()));
        causa.setIdOrigen(compOrigen);
        causa.setCodCausa(i.getCodigoCausa());
        causa.setDescrpcion(i.getDescripcionCausa());
        causa.setEstado(i.getEstado());
        causa.setCausas(i.getDescripcionCausa());
        //causa.setUsuario(usuarioLogueado);
        causa.setFechaCreacion(new Date());
        causa.setIdCodigoAnomalia(i.getCodigoAnomalia());
        causa.setDescripcionCodigoAnomalia(i.getDescripcionAnomalia());
        causa.setIdProblema(i.getCodigoProblema());
        causa.setDescripcionIdProblema(i.getDescripcionProblema());
        causa.setTv(i.getTv());
        causa.setInt1(i.getInternet());
        causa.setTel(i.getTelefonia());
        return causa;
    }

}
