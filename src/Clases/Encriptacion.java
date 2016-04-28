/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author CRISTIAN
 */
public class Encriptacion {

    public String encriptar(String contraseña) {
        String key = "agfqw9.2jk";
        String contraseñaencriptada;
        contraseñaencriptada = DigestUtils.sha512Hex(contraseña + key);
        return contraseñaencriptada;
    }
    
    
}
