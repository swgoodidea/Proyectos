/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swgoodidea.examples.type;

/**
 *
 * @author USUARIO
 */
public enum ViewOperationType {

    MODIFIED(new Integer(1),"MODIFICADO"),
    REGISTER(new Integer(2),"REGISTRADO"),
    DELETE(new Integer(3),"ELIMINADO");
    
    private Integer code;
    private String value;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private ViewOperationType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}