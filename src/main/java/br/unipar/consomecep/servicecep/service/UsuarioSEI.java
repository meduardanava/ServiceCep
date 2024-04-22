package br.unipar.consomecep.servicecep.service;

import br.unipar.consomecep.servicecep.model.Usuario;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface UsuarioSEI {

    @WebMethod
    String boasVindas(@WebParam(name = "nome") String nome);

    @WebMethod
    Usuario criarUsuario(@WebParam(name = "id"))
    @WebMethod
    Usuario consultarUsuario(@WebParam(name = "idUsuario")Long idUsuario);

    @WebMethod
    Usuario atualizarUsuario(@WebParam(name = "idUsuario")Long idUsuario);

    @WebMethod
    Usuario excluirUsuario(@WebParam(name = "idUsuario")Long idUsuario);
}
