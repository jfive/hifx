package br.com.jfive.hifx.services;

import br.com.jfive.hifx.model.UsuarioE;
import br.com.jfive.hifx.persistence.TesteDAO;
import br.com.jfive.hifx.services.interfaces.TesteService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class TesteServiceBean implements TesteService {

    @Inject
    private TesteDAO testeDAO;

    @Override
    public UsuarioE busca(){
        return testeDAO.buscar();
    }

}
