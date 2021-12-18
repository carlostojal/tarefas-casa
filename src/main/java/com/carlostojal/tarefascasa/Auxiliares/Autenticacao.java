package com.carlostojal.tarefascasa.Auxiliares;

import com.carlostojal.tarefascasa.Entidades.Utilizador;

import java.util.Base64;

public class Autenticacao {

    public static Utilizador descodificarToken(String token) {

        Utilizador utilizador = new Utilizador();

        // extrair token
        String t = token.split(" ")[1];

        // descodificar Base64
        byte[] bytesDescodificados = Base64.getDecoder().decode(t);
        String stringDescodificada = new String(bytesDescodificados);

        // extrair autenticacao
        String[] credenciais = stringDescodificada.split(":");

        // definir credenciais na instancia retornada
        utilizador.setNome(credenciais[0]);
        utilizador.setPassword(credenciais[1]);

        return utilizador;
    }
}
