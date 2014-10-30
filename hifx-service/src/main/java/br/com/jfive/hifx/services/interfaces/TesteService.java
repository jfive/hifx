package br.com.jfive.hifx.services.interfaces;

import br.com.jfive.hifx.model.UsuarioE;

import javax.ejb.Local;

@Local
public interface TesteService {
    UsuarioE busca();
}
