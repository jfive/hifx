package br.com.jfive.hifx.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Rodrigo on 30/10/2014.
 */
@Entity
@Table(name="usuario")
public class UsuarioE implements Serializable{

    @Id
    @Column(name="usuario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="usuario_login")
    private String login;
    @Column(name="usuario_senha")
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
