/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.residenciaFlorenceWar.beans;

import cl.usm.residenciaEjb.dao.ResidenteDAOLocal;
import cl.usm.residenciaEjb.dto.Residente;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author Senpai
 */
@Named(value = "residentesManagedBean")
@ViewScoped
public class ResidentesManagedBean implements Serializable{

    @Inject
    private ResidenteDAOLocal residenteDAO;
    
    private List<Residente> residentes;
    
    @PostConstruct
    public void init(){
        this.residentes = this.residenteDAO.findAll();
    }
    
    public ResidentesManagedBean() {
    }

    public List<Residente> getResidentes() {
        return residentes;
    }

    public void setResidentes(List<Residente> residentes) {
        this.residentes = residentes;
    }
    
}
