package br.com.jfive.hifx.persistence;

import br.com.jfive.hifx.model.UsuarioE;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TesteDAOImpl implements TesteDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public UsuarioE buscar(){
        return em.find(UsuarioE.class,1);
    }


}
