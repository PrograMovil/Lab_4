package com.laboratorio_4;

import LogicaNegocio.Usuario;

/**
 * Created by SheshoVega on 13/03/2017.
 */

public class Controlador {
    Usuario currentUser;

    public void acceder(String username, String password){
        currentUser = new Usuario(username,password);
    }

}
