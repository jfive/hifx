package br.com.jfive.hifx.persistence;

import br.com.jfive.hifx.model.UsuarioE;

import javax.ejb.Local;

@Local
public interface TesteDAO {
    UsuarioE buscar();
}
