package br.com.jfive.hifx.web.rest;

import br.com.jfive.hifx.model.UsuarioE;
import br.com.jfive.hifx.services.interfaces.TesteService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Rodrigo on 29/10/2014.
 */
@Path("/")
@RequestScoped
public class RootRestService {

    @Inject
    private TesteService testeService;


    @Path("xx")
    @GET
    @Produces("application/json")
    public UsuarioE xx(){

        UsuarioE busca = testeService.busca();
        return busca;
    }
}
