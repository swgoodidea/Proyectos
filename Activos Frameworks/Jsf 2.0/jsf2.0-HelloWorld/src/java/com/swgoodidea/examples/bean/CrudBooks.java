/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swgoodidea.examples.bean;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author USUARIO
 */
@ManagedBean
@SessionScoped
public class CrudBooks {
    /**
     * Creates a new instance of CrudBooks
     */
    private String message = "Message Nro: ";
    
    public CrudBooks() {
    }
    
    public String showMessageOnView(){
        return  message + new Random().nextInt(99) + 1;
    }
}