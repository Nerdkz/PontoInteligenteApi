/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leucotron.pontointeligente.api.response;

import com.leucotron.pontointeligente.api.dtos.CadastroPJDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius
 */
public class Response<T> {
    
    private T data;
    private List<String> errors;
    
    public Response(){
    }
    
    public T getData(){
        return data;
    }
    
    public void setdata(T data){
        this.data = data;
    }
    
    public List<String> getErrors(){
        if(this.errors == null){
            this.errors = new ArrayList<String>();
        }
        return errors;
    }
    
    public void setErrors(List<String> errors){
        this.errors = errors;
    }

    public void setData(CadastroPJDto converterCadastroPJDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
